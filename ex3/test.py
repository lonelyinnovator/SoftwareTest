# -*- coding: utf-8 -*-
"""
author: 沈佳军
datetime:2021/10/31 14:15
"""

import selenium.webdriver as wd

driver = wd.Chrome()
driver.get("https://nj.zu.anjuke.com/")

# 点击租房
driver.find_element_by_xpath("/html/body/div[2]/div/ul/li[4]/a").click()

# 找到城市列表
city_list = driver.find_element_by_xpath('//*[@id="city_list"]')

# 将城市的下拉列表中style的display: none去除
driver.execute_script("arguments[0].removeAttribute('style')", city_list)

# 点击城市中的南京
driver.find_element_by_xpath('//*[@id="city_list"]/dl[2]/dd/a[4]').click()

# 点击地铁找房
driver.find_element_by_xpath('/html/body/div[4]/ul/li[2]/a').click()

# 点击二号线
driver.find_element_by_xpath('/html/body/div[5]/div[2]/div[1]/span[2]/div/a[3]').click()

# 点击马群
driver.find_element_by_xpath('/html/body/div[5]/div[2]/div[1]/span[2]/div/div/a[20]').click()

# 找到input并设置值，点击确定
input_one = driver.find_element_by_xpath('//*[@id="from-price"]')
input_two = driver.find_element_by_xpath('//*[@id="to-price"]')
driver.execute_script('arguments[0].value = "5000"', input_one)
driver.execute_script('arguments[0].value = "8000"', input_two)

# 点击input后会显示确定按钮，之后就可以点击确定按钮
input_two.click()
driver.find_element_by_xpath('//*[@id="pricerange_search"]').click()

# 选择整租
driver.find_element_by_xpath('/html/body/div[5]/div[2]/div[4]/span[2]/a[2]').click()

# 得到房租类型
houses = driver.find_element_by_xpath('//*[@id="condmenu"]/ul/li[2]/ul')
driver.execute_script("arguments[0].style='display: block;'", houses)

# 得到普通住宅
driver.find_element_by_xpath('//*[@id="condmenu"]/ul/li[2]/ul/li[2]/a').click()

# 得到搜索框，并点击搜索
search = driver.find_element_by_xpath('//*[@id="search-rent"]')
driver.execute_script("arguments[0].value='经天路'", search)
driver.find_element_by_xpath('//*[@id="search-button"]').click()

# 选择视频看房
driver.find_element_by_xpath('//*[@id="list-content"]/div[1]/a[2]').click()

# 点击租金和最新排序
driver.find_element_by_xpath('//*[@id="list-content"]/div[2]/div/a[2]').click()
driver.find_element_by_xpath('//*[@id="list-content"]/div[2]/div/a[3]').click()

# 点击第一个搜索出来的
driver.find_element_by_xpath('//*[@id="list-content"]/div[3]').click()
