/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2017 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package tk.mybatis.mapper.weekend;

import tk.mybatis.mapper.weekend.reflection.Reflections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XuYin
 */
public class WeekendSqls {
    private Criteria criteria;

    private WeekendSqls() {
        this.criteria = new Criteria();
    }

    public static WeekendSqls custom() {
        return new WeekendSqls();
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public WeekendSqls andIsNull(String property) {
        this.criteria.criterions.add(new Criterion(property, "is null", "and"));
        return this;
    }

    public WeekendSqls andIsNull(Fn fn) {
        return this.andIsNull(Reflections.fnToFieldName(fn));
    }

    public WeekendSqls andIsNotNull(String property) {
        this.criteria.criterions.add(new Criterion(property, "is not null", "and"));
        return this;
    }

    public WeekendSqls andIsNotNull(Fn fn) {
        return this.andIsNotNull(Reflections.fnToFieldName(fn));
    }

    public WeekendSqls andEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "=", "and"));
        return this;
    }

    public WeekendSqls andEqualTo(Fn fn, Object value) {
        return this.andEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andNotEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<>", "and"));
        return this;
    }

    public WeekendSqls andNotEqualTo(Fn fn, Object value) {
        return this.andNotEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andGreaterThan(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, ">", "and"));
        return this;
    }

    public WeekendSqls andGreaterThan(Fn fn, Object value) {
        return this.andGreaterThan(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andGreaterThanOrEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, ">=", "and"));
        return this;
    }

    public WeekendSqls andGreaterThanOrEqualTo(Fn fn, Object value) {
        return this.andGreaterThanOrEqualTo(Reflections.fnToFieldName(fn), value);
    }


    public WeekendSqls andLessThan(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<", "and"));
        return this;
    }

    public WeekendSqls andLessThan(Fn fn, Object value) {
        return this.andLessThan(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andLessThanOrEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<=", "and"));
        return this;
    }

    public WeekendSqls andLessThanOrEqualTo(Fn fn, Object value) {
        return this.andLessThanOrEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andIn(String property, Iterable values) {
        this.criteria.criterions.add(new Criterion(property, values, "in", "and"));
        return this;
    }

    public WeekendSqls andIn(Fn fn, Iterable values) {
        return this.andIn(Reflections.fnToFieldName(fn), values);
    }

    public WeekendSqls andNotIn(String property, Iterable values) {
        this.criteria.criterions.add(new Criterion(property, values, "not in", "and"));
        return this;
    }

    public WeekendSqls andNotIn(Fn fn, Iterable values) {
        return this.andNotIn(Reflections.fnToFieldName(fn), values);
    }

    public WeekendSqls andBetween(String property, Object value1, Object value2) {
        this.criteria.criterions.add(new Criterion(property, value1, value2, "between", "and"));
        return this;
    }

    public WeekendSqls andBetween(Fn fn, Object value1, Object value2) {
        return this.andBetween(Reflections.fnToFieldName(fn), value1, value2);
    }

    public WeekendSqls andNotBetween(String property, Object value1, Object value2) {
        this.criteria.criterions.add(new Criterion(property, value1, value2, "not between", "and"));
        return this;
    }

    public WeekendSqls andNotBetween(Fn fn, Object value1, Object value2) {
        return this.andNotBetween(Reflections.fnToFieldName(fn), value1, value2);
    }

    public WeekendSqls andLike(String property, String value) {
        this.criteria.criterions.add(new Criterion(property, value, "like", "and"));
        return this;
    }

    public WeekendSqls andLike(Fn fn, String value) {
        return this.andLike(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls andNotLike(String property, String value) {
        this.criteria.criterions.add(new Criterion(property, value, "not like", "and"));
        return this;
    }

    public WeekendSqls andNotLike(Fn fn, String value) {
        return this.andNotLike(Reflections.fnToFieldName(fn), value);
    }


    public WeekendSqls orIsNull(String property) {
        this.criteria.criterions.add(new Criterion(property, "is null", "or"));
        return this;
    }

    public WeekendSqls orIsNull(Fn fn) {
        return this.orIsNull(Reflections.fnToFieldName(fn));
    }

    public WeekendSqls orIsNotNull(String property) {
        this.criteria.criterions.add(new Criterion(property, "is not null", "or"));
        return this;
    }

    public WeekendSqls orIsNotNull(Fn fn) {
        return this.orIsNotNull(Reflections.fnToFieldName(fn));
    }


    public WeekendSqls orEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "=", "or"));
        return this;
    }

    public WeekendSqls orEqualTo(Fn fn, String value) {
        return this.orEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orNotEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<>", "or"));
        return this;
    }

    public WeekendSqls orNotEqualTo(Fn fn, String value) {
        return this.orNotEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orGreaterThan(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, ">", "or"));
        return this;
    }

    public WeekendSqls orGreaterThan(Fn fn, String value) {
        return this.orGreaterThan(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orGreaterThanOrEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, ">=", "or"));
        return this;
    }

    public WeekendSqls orGreaterThanOrEqualTo(Fn fn, String value) {
        return this.orGreaterThanOrEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orLessThan(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<", "or"));
        return this;
    }

    public WeekendSqls orLessThan(Fn fn, String value) {
        return this.orLessThan(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orLessThanOrEqualTo(String property, Object value) {
        this.criteria.criterions.add(new Criterion(property, value, "<=", "or"));
        return this;
    }

    public WeekendSqls orLessThanOrEqualTo(Fn fn, String value) {
        return this.orLessThanOrEqualTo(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orIn(String property, Iterable values) {
        this.criteria.criterions.add(new Criterion(property, values, "in", "or"));
        return this;
    }

    public WeekendSqls orIn(Fn fn, Iterable values) {
        return this.orIn(Reflections.fnToFieldName(fn), values);
    }

    public WeekendSqls orNotIn(String property, Iterable values) {
        this.criteria.criterions.add(new Criterion(property, values, "not in", "or"));
        return this;
    }

    public WeekendSqls orNotIn(Fn fn, Iterable values) {
        return this.orNotIn(Reflections.fnToFieldName(fn), values);
    }

    public WeekendSqls orBetween(String property, Object value1, Object value2) {
        this.criteria.criterions.add(new Criterion(property, value1, value2, "between", "or"));
        return this;
    }

    public WeekendSqls orBetween(Fn fn, Object value1, Object value2) {
        return this.orBetween(Reflections.fnToFieldName(fn), value1, value2);
    }

    public WeekendSqls orNotBetween(String property, Object value1, Object value2) {
        this.criteria.criterions.add(new Criterion(property, value1, value2, "not between", "or"));
        return this;
    }

    public WeekendSqls orNotBetween(Fn fn, Object value1, Object value2) {
        return this.orNotBetween(Reflections.fnToFieldName(fn), value1, value2);
    }

    public WeekendSqls orLike(String property, String value) {
        this.criteria.criterions.add(new Criterion(property, value, "like", "or"));
        return this;
    }

    public WeekendSqls orLike(Fn fn, String value) {
        return this.orLike(Reflections.fnToFieldName(fn), value);
    }

    public WeekendSqls orNotLike(String property, String value) {
        this.criteria.criterions.add(new Criterion(property, value, "not like", "or"));
        return this;
    }

    public WeekendSqls orNotLike(Fn fn, String value) {
        return this.orNotLike(Reflections.fnToFieldName(fn), value);
    }

    public static class Criteria {
        private String andOr;
        private List<Criterion> criterions;

        public Criteria() {
            this.criterions = new ArrayList<Criterion>(2);
        }

        public List<Criterion> getCriterions() {
            return criterions;
        }

        public String getAndOr() {
            return andOr;
        }

        public void setAndOr(String andOr) {
            this.andOr = andOr;
        }
    }

    public static class Criterion {
        private String property;
        private Object value;
        private Object secondValue;
        private String condition;
        private String andOr;

        public Criterion(String property, String condition, String andOr) {
            this.property = property;
            this.condition = condition;
            this.andOr = andOr;
        }


        public Criterion(String property, Object value, String condition, String andOr) {
            this.property = property;
            this.value = value;
            this.condition = condition;
            this.andOr = andOr;
        }

        public Criterion(String property, Object value1, Object value2, String condition, String andOr) {
            this.property = property;
            this.value = value1;
            this.secondValue = value2;
            this.condition = condition;
            this.andOr = andOr;
        }

        public String getProperty() {
            return property;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public Object[] getValues() {
            if (value != null) {
                if (secondValue != null) {
                    return new Object[]{value, secondValue};
                } else {
                    return new Object[]{value};
                }
            } else {
                return new Object[]{};
            }
        }

        public String getCondition() {
            return condition;
        }

        public String getAndOr() {
            return andOr;
        }
    }
}
