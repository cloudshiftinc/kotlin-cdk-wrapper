@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for CIDR routing in Route 53 resource record set objects.
 *
 * Example:
 *
 * ```
 * HostedZone myZone;
 * CfnCidrCollection cidrCollection = CfnCidrCollection.Builder.create(this, "CidrCollection")
 * .name("test-collection")
 * .locations(List.of(LocationProperty.builder()
 * .cidrList(List.of("192.168.1.0/24"))
 * .locationName("my_location")
 * .build()))
 * .build();
 * ARecord.Builder.create(this, "CidrRoutingConfig")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.4"))
 * .setIdentifier("test")
 * .cidrRoutingConfig(CidrRoutingConfig.create(CidrRoutingConfigProps.builder()
 * .collectionId(cidrCollection.getAttrId())
 * .locationName("test_location")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-cidrroutingconfig)
 */
public open class CidrRoutingConfig(
  cdkObject: software.amazon.awscdk.services.route53.CidrRoutingConfig,
) : CdkObject(cdkObject) {
  /**
   * The CIDR collection ID.
   */
  public open fun collectionId(): String = unwrap(this).getCollectionId()

  /**
   * The CIDR collection location name.
   */
  public open fun locationName(): String = unwrap(this).getLocationName()

  public companion object {
    public fun create(props: CidrRoutingConfigProps): CidrRoutingConfig =
        software.amazon.awscdk.services.route53.CidrRoutingConfig.create(props.let(CidrRoutingConfigProps.Companion::unwrap)).let(CidrRoutingConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08feaa6062412857b6f934d28f44132218c1ee9513051c6065b23b03df1b792d")
    public fun create(props: CidrRoutingConfigProps.Builder.() -> Unit): CidrRoutingConfig =
        create(CidrRoutingConfigProps(props))

    public fun withDefaultLocationName(collectionId: String): CidrRoutingConfig =
        software.amazon.awscdk.services.route53.CidrRoutingConfig.withDefaultLocationName(collectionId).let(CidrRoutingConfig::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CidrRoutingConfig):
        CidrRoutingConfig = CidrRoutingConfig(cdkObject)

    internal fun unwrap(wrapped: CidrRoutingConfig):
        software.amazon.awscdk.services.route53.CidrRoutingConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.CidrRoutingConfig
  }
}
