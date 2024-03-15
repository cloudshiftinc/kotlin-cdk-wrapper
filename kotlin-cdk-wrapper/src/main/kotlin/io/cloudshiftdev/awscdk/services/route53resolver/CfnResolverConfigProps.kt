@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResolverConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverConfigProps cfnResolverConfigProps = CfnResolverConfigProps.builder()
 * .autodefinedReverseFlag("autodefinedReverseFlag")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html)
 */
public interface CfnResolverConfigProps {
  /**
   * Represents the desired status of `AutodefinedReverse` .
   *
   * The only supported value on creation is `DISABLE` . Deletion of this resource will return
   * `AutodefinedReverse` to its default value of `ENABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-autodefinedreverseflag)
   */
  public fun autodefinedReverseFlag(): String

  /**
   * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-resourceid)
   */
  public fun resourceId(): String

  /**
   * A builder for [CfnResolverConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` . 
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     */
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String)

    /**
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     * Resolver for. 
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps.builder()

    /**
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` . 
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     */
    override fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
      cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    /**
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     * Resolver for. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps,
  ) : CdkObject(cdkObject), CfnResolverConfigProps {
    /**
     * Represents the desired status of `AutodefinedReverse` .
     *
     * The only supported value on creation is `DISABLE` . Deletion of this resource will return
     * `AutodefinedReverse` to its default value of `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-autodefinedreverseflag)
     */
    override fun autodefinedReverseFlag(): String = unwrap(this).getAutodefinedReverseFlag()

    /**
     * The ID of the Amazon Virtual Private Cloud VPC that you're configuring Resolver for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html#cfn-route53resolver-resolverconfig-resourceid)
     */
    override fun resourceId(): String = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps):
        CfnResolverConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps
  }
}
