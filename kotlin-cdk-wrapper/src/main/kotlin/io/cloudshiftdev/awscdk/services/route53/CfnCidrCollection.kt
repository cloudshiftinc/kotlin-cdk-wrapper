@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a CIDR collection in the current AWS account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnCidrCollection cfnCidrCollection = CfnCidrCollection.Builder.create(this,
 * "MyCfnCidrCollection")
 * .name("name")
 * // the properties below are optional
 * .locations(List.of(LocationProperty.builder()
 * .cidrList(List.of("cidrList"))
 * .locationName("locationName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html)
 */
public open class CfnCidrCollection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection,
) : CfnResource(cdkObject), IInspectable {
  /**
   * "The Amazon resource name (ARN) to uniquely identify the AWS resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The UUID of the CIDR collection.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A complex type that contains information about the list of CIDR locations.
   */
  public open fun locations(): Any? = unwrap(this).getLocations()

  /**
   * A complex type that contains information about the list of CIDR locations.
   */
  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type that contains information about the list of CIDR locations.
   */
  public open fun locations(_idx_ac66f0: List<Any>) {
    unwrap(this).setLocations(_idx_ac66f0)
  }

  /**
   * A complex type that contains information about the list of CIDR locations.
   */
  public open fun locations(vararg _idx_ac66f0: Any): Unit = locations(_idx_ac66f0.toList())

  /**
   * The name of a CIDR collection.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a CIDR collection.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CfnCidrCollection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    public fun locations(locations: IResolvable)

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    public fun locations(locations: List<Any>)

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    public fun locations(vararg locations: Any)

    /**
     * The name of a CIDR collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-name)
     * @param name The name of a CIDR collection. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnCidrCollection.Builder =
        software.amazon.awscdk.services.route53.CfnCidrCollection.Builder.create(scope, id)

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
    }

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
    }

    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     * @param locations A complex type that contains information about the list of CIDR locations. 
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * The name of a CIDR collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-name)
     * @param name The name of a CIDR collection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnCidrCollection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCidrCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCidrCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection):
        CfnCidrCollection = CfnCidrCollection(cdkObject)

    internal fun unwrap(wrapped: CfnCidrCollection):
        software.amazon.awscdk.services.route53.CfnCidrCollection = wrapped.cdkObject
  }

  /**
   * Specifies the list of CIDR blocks for a CIDR location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .cidrList(List.of("cidrList"))
   * .locationName("locationName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html)
   */
  public interface LocationProperty {
    /**
     * List of CIDR blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html#cfn-route53-cidrcollection-location-cidrlist)
     */
    public fun cidrList(): List<String>

    /**
     * The CIDR collection location name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html#cfn-route53-cidrcollection-location-locationname)
     */
    public fun locationName(): String

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrList List of CIDR blocks. 
       */
      public fun cidrList(cidrList: List<String>)

      /**
       * @param cidrList List of CIDR blocks. 
       */
      public fun cidrList(vararg cidrList: String)

      /**
       * @param locationName The CIDR collection location name. 
       */
      public fun locationName(locationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty.Builder =
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty.builder()

      /**
       * @param cidrList List of CIDR blocks. 
       */
      override fun cidrList(cidrList: List<String>) {
        cdkBuilder.cidrList(cidrList)
      }

      /**
       * @param cidrList List of CIDR blocks. 
       */
      override fun cidrList(vararg cidrList: String): Unit = cidrList(cidrList.toList())

      /**
       * @param locationName The CIDR collection location name. 
       */
      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty,
    ) : CdkObject(cdkObject), LocationProperty {
      /**
       * List of CIDR blocks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html#cfn-route53-cidrcollection-location-cidrlist)
       */
      override fun cidrList(): List<String> = unwrap(this).getCidrList()

      /**
       * The CIDR collection location name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-cidrcollection-location.html#cfn-route53-cidrcollection-location-locationname)
       */
      override fun locationName(): String = unwrap(this).getLocationName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty
    }
  }
}
