@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCidrCollection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnCidrCollectionProps cfnCidrCollectionProps = CfnCidrCollectionProps.builder()
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
public interface CfnCidrCollectionProps {
  /**
   * A complex type that contains information about the list of CIDR locations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
   */
  public fun locations(): Any? = unwrap(this).getLocations()

  /**
   * The name of a CIDR collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnCidrCollectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(locations: IResolvable)

    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(locations: List<Any>)

    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    public fun locations(vararg locations: Any)

    /**
     * @param name The name of a CIDR collection. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnCidrCollectionProps.Builder =
        software.amazon.awscdk.services.route53.CfnCidrCollectionProps.builder()

    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param locations A complex type that contains information about the list of CIDR locations.
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * @param name The name of a CIDR collection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollectionProps,
  ) : CdkObject(cdkObject),
      CfnCidrCollectionProps {
    /**
     * A complex type that contains information about the list of CIDR locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-locations)
     */
    override fun locations(): Any? = unwrap(this).getLocations()

    /**
     * The name of a CIDR collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html#cfn-route53-cidrcollection-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCidrCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollectionProps):
        CfnCidrCollectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCidrCollectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCidrCollectionProps):
        software.amazon.awscdk.services.route53.CfnCidrCollectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnCidrCollectionProps
  }
}
