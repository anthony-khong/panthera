(ns panthera.panthera
  (:refer-clojure
    :exclude [mod])
  (:require
    [tech.parallel.utils :refer [export-symbols]]
    [panthera.pandas.generics]
    [panthera.pandas.math]
    [panthera.pandas.utils]
    [panthera.pandas.conversion]
    [panthera.pandas.reshape]))

(export-symbols
  panthera.pandas.generics
  n-rows
  one-hot
  hasnans?
  cross-section
  subset-cols
  names
  read-csv
  unique
  filter-rows
  dtype
  value-counts
  index
  series
  read-excel
  to-csv
  data-frame
  subset-rows
  decreasing?
  nsmallest
  n-cols
  nunique
  head
  increasing?
  memory-usage
  values
  monotonic?
  reset-index
  nlargest
  unique?
  shape
  nbytes
  ftype)

(export-symbols
  panthera.pandas.math
  add
  sub
  mul
  div
  mod
  pow
  lt
  gt
  le
  ge
  eq
  ne
  dot
  abs
  all?
  any?
  autocorr
  between
  clip
  corr
  cnt
  cov
  cummax
  cummin
  cumprod
  cumsum
  diff
  compound
  describe
  kurtosis
  mean-abs-dev
  maximum
  minimum
  mean
  median
  mode
  pct-change
  quantile
  rank
  round
  sem
  skew
  std
  var)

(export-symbols
  panthera.pandas.utils
  pytype
  slice
  ->clj
  series?
  data-frame?)

(export-symbols
  panthera.pandas.conversion
  ->numeric
  ->datetime
  ->timedelta
  date-range
  timedelta-range
  infer-time-freq
  astype)

(export-symbols
  panthera.pandas.reshape
  crosstab
  pivot
  cut
  qcut
  merge-ordered
  merge-asof
  concatenate
  factorize
  aggregate
  remap
  groupby
  rolling
  ewm)