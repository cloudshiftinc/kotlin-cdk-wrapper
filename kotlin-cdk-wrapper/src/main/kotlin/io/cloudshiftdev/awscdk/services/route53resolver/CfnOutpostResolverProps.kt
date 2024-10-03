@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnOutpostResolver`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnOutpostResolverProps cfnOutpostResolverProps = CfnOutpostResolverProps.builder()
 * .name("name")
 * .outpostArn("outpostArn")
 * .preferredInstanceType("preferredInstanceType")
 * // the properties below are optional
 * .instanceCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html)
 */
public interface CfnOutpostResolverProps {
  /**
   * Amazon EC2 instance count for the Resolver on the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-instancecount)
   */
  public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

  /**
   * Name of the Resolver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-name)
   */
  public fun name(): String

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-outpostarn)
   */
  public fun outpostArn(): String

  /**
   * The Amazon EC2 instance type.
   *
   * If you specify this, you must also specify a value for the `OutpostArn` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-preferredinstancetype)
   */
  public fun preferredInstanceType(): String

  /**
   * A key value pair that helps you identify a Route 53 Resolver .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnOutpostResolverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost.
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param name Name of the Resolver. 
     */
    public fun name(name: String)

    /**
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    public fun outpostArn(outpostArn: String)

    /**
     * @param preferredInstanceType The Amazon EC2 instance type. 
     * If you specify this, you must also specify a value for the `OutpostArn` .
     */
    public fun preferredInstanceType(preferredInstanceType: String)

    /**
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps.builder()

    /**
     * @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost.
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param name Name of the Resolver. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param preferredInstanceType The Amazon EC2 instance type. 
     * If you specify this, you must also specify a value for the `OutpostArn` .
     */
    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A key value pair that helps you identify a Route 53 Resolver .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps,
  ) : CdkObject(cdkObject),
      CfnOutpostResolverProps {
    /**
     * Amazon EC2 instance count for the Resolver on the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-instancecount)
     */
    override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * Name of the Resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-outpostarn)
     */
    override fun outpostArn(): String = unwrap(this).getOutpostArn()

    /**
     * The Amazon EC2 instance type.
     *
     * If you specify this, you must also specify a value for the `OutpostArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-preferredinstancetype)
     */
    override fun preferredInstanceType(): String = unwrap(this).getPreferredInstanceType()

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOutpostResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps):
        CfnOutpostResolverProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOutpostResolverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOutpostResolverProps):
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolverProps
  }
}
