@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class PriceClass(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.PriceClass,
) {
  PRICE_CLASS_100(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_100),
  PRICE_CLASS_200(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_200),
  PRICE_CLASS_ALL(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.PriceClass): PriceClass
        = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_100 ->
          PriceClass.PRICE_CLASS_100
      software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_200 ->
          PriceClass.PRICE_CLASS_200
      software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_ALL ->
          PriceClass.PRICE_CLASS_ALL
    }

    internal fun unwrap(wrapped: PriceClass): software.amazon.awscdk.services.cloudfront.PriceClass
        = wrapped.cdkObject
  }
}
