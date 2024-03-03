package com.example.chinesemedicinesalessystem.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReceiveidIsNull() {
            addCriterion("receiveid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveidIsNotNull() {
            addCriterion("receiveid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveidEqualTo(Long value) {
            addCriterion("receiveid =", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotEqualTo(Long value) {
            addCriterion("receiveid <>", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThan(Long value) {
            addCriterion("receiveid >", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThanOrEqualTo(Long value) {
            addCriterion("receiveid >=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThan(Long value) {
            addCriterion("receiveid <", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThanOrEqualTo(Long value) {
            addCriterion("receiveid <=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidIn(List<Long> values) {
            addCriterion("receiveid in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotIn(List<Long> values) {
            addCriterion("receiveid not in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidBetween(Long value1, Long value2) {
            addCriterion("receiveid between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotBetween(Long value1, Long value2) {
            addCriterion("receiveid not between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(BigDecimal value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(BigDecimal value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(BigDecimal value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(BigDecimal value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<BigDecimal> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<BigDecimal> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNull() {
            addCriterion("expressid is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("expressid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(String value) {
            addCriterion("expressid =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(String value) {
            addCriterion("expressid <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(String value) {
            addCriterion("expressid >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(String value) {
            addCriterion("expressid >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(String value) {
            addCriterion("expressid <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(String value) {
            addCriterion("expressid <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLike(String value) {
            addCriterion("expressid like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotLike(String value) {
            addCriterion("expressid not like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<String> values) {
            addCriterion("expressid in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<String> values) {
            addCriterion("expressid not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(String value1, String value2) {
            addCriterion("expressid between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(String value1, String value2) {
            addCriterion("expressid not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeIsNull() {
            addCriterion("patmenttime is null");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeIsNotNull() {
            addCriterion("patmenttime is not null");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeEqualTo(Date value) {
            addCriterion("patmenttime =", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeNotEqualTo(Date value) {
            addCriterion("patmenttime <>", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeGreaterThan(Date value) {
            addCriterion("patmenttime >", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patmenttime >=", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeLessThan(Date value) {
            addCriterion("patmenttime <", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeLessThanOrEqualTo(Date value) {
            addCriterion("patmenttime <=", value, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeIn(List<Date> values) {
            addCriterion("patmenttime in", values, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeNotIn(List<Date> values) {
            addCriterion("patmenttime not in", values, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeBetween(Date value1, Date value2) {
            addCriterion("patmenttime between", value1, value2, "patmenttime");
            return (Criteria) this;
        }

        public Criteria andPatmenttimeNotBetween(Date value1, Date value2) {
            addCriterion("patmenttime not between", value1, value2, "patmenttime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}