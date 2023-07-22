@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionRestrictionsPropertyDsl {
  private val cdkBuilder: CfnDistribution.RestrictionsProperty.Builder =
      CfnDistribution.RestrictionsProperty.builder()

  /**
   * @param geoRestriction A complex type that controls the countries in which your content is
   * distributed. 
   * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To disable
   * geo restriction, remove the
   * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
   * property from your stack template.
   */
  public fun geoRestriction(geoRestriction: IResolvable) {
    cdkBuilder.geoRestriction(geoRestriction)
  }

  /**
   * @param geoRestriction A complex type that controls the countries in which your content is
   * distributed. 
   * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To disable
   * geo restriction, remove the
   * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
   * property from your stack template.
   */
  public fun geoRestriction(geoRestriction: CfnDistribution.GeoRestrictionProperty) {
    cdkBuilder.geoRestriction(geoRestriction)
  }

  public fun build(): CfnDistribution.RestrictionsProperty = cdkBuilder.build()
}
