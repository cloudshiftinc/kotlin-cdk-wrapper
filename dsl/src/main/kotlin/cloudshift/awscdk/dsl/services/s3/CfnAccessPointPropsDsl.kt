@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnAccessPointProps

@CdkDslMarker
public class CfnAccessPointPropsDsl {
  private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

  /**
   * @param bucket The name of the bucket associated with this access point. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
   * access point.
   */
  public fun bucketAccountId(bucketAccountId: String) {
    cdkBuilder.bucketAccountId(bucketAccountId)
  }

  /**
   * @param name The name of this access point.
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * access point name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policy The access point policy associated with this access point.
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The access point policy associated with this access point.
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
   * apply to this Amazon S3 bucket.
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   */
  public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
    cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
  }

  /**
   * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
   * apply to this Amazon S3 bucket.
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   */
  public
      fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty) {
    cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
  }

  /**
   * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point, if
   * one exists.
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point, if
   * one exists.
   */
  public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAccessPointProps = cdkBuilder.build()
}
