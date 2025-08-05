@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for configuring CIDR routing in Route 53 resource record set objects.
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
 */
public interface CidrRoutingConfigProps {
  /**
   * The CIDR collection ID.
   */
  public fun collectionId(): String

  /**
   * The CIDR collection location name.
   *
   * Default: `*`
   */
  public fun locationName(): String? = unwrap(this).getLocationName()

  /**
   * A builder for [CidrRoutingConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param collectionId The CIDR collection ID. 
     */
    public fun collectionId(collectionId: String)

    /**
     * @param locationName The CIDR collection location name.
     */
    public fun locationName(locationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CidrRoutingConfigProps.Builder =
        software.amazon.awscdk.services.route53.CidrRoutingConfigProps.builder()

    /**
     * @param collectionId The CIDR collection ID. 
     */
    override fun collectionId(collectionId: String) {
      cdkBuilder.collectionId(collectionId)
    }

    /**
     * @param locationName The CIDR collection location name.
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.route53.CidrRoutingConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CidrRoutingConfigProps,
  ) : CdkObject(cdkObject),
      CidrRoutingConfigProps {
    /**
     * The CIDR collection ID.
     */
    override fun collectionId(): String = unwrap(this).getCollectionId()

    /**
     * The CIDR collection location name.
     *
     * Default: `*`
     */
    override fun locationName(): String? = unwrap(this).getLocationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CidrRoutingConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CidrRoutingConfigProps):
        CidrRoutingConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CidrRoutingConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CidrRoutingConfigProps):
        software.amazon.awscdk.services.route53.CidrRoutingConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CidrRoutingConfigProps
  }
}
