@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mpa

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdentitySource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mpa.*;
 * CfnIdentitySourceProps cfnIdentitySourceProps = CfnIdentitySourceProps.builder()
 * .identitySourceParameters(IdentitySourceParametersProperty.builder()
 * .iamIdentityCenter(IamIdentityCenterProperty.builder()
 * .instanceArn("instanceArn")
 * .region("region")
 * // the properties below are optional
 * .approvalPortalUrl("approvalPortalUrl")
 * .build())
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html)
 */
public interface CfnIdentitySourceProps {
  /**
   * A `IdentitySourceParameters` object.
   *
   * Contains details for the resource that provides identities to the identity source. For example,
   * an IAM Identity Center instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
   */
  public fun identitySourceParameters(): Any

  /**
   * Tags that you have added to the specified resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIdentitySourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    public fun identitySourceParameters(identitySourceParameters: IResolvable)

    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    public
        fun identitySourceParameters(identitySourceParameters: CfnIdentitySource.IdentitySourceParametersProperty)

    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56918cda224c427f6fe803ae042cbe4e9a908757a10b49ae96a6107d24d49ce")
    public
        fun identitySourceParameters(identitySourceParameters: CfnIdentitySource.IdentitySourceParametersProperty.Builder.() -> Unit)

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mpa.CfnIdentitySourceProps.Builder =
        software.amazon.awscdk.services.mpa.CfnIdentitySourceProps.builder()

    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    override fun identitySourceParameters(identitySourceParameters: IResolvable) {
      cdkBuilder.identitySourceParameters(identitySourceParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    override
        fun identitySourceParameters(identitySourceParameters: CfnIdentitySource.IdentitySourceParametersProperty) {
      cdkBuilder.identitySourceParameters(identitySourceParameters.let(CfnIdentitySource.IdentitySourceParametersProperty.Companion::unwrap))
    }

    /**
     * @param identitySourceParameters A `IdentitySourceParameters` object. 
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56918cda224c427f6fe803ae042cbe4e9a908757a10b49ae96a6107d24d49ce")
    override
        fun identitySourceParameters(identitySourceParameters: CfnIdentitySource.IdentitySourceParametersProperty.Builder.() -> Unit):
        Unit =
        identitySourceParameters(CfnIdentitySource.IdentitySourceParametersProperty(identitySourceParameters))

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mpa.CfnIdentitySourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySourceProps,
  ) : CdkObject(cdkObject),
      CfnIdentitySourceProps {
    /**
     * A `IdentitySourceParameters` object.
     *
     * Contains details for the resource that provides identities to the identity source. For
     * example, an IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-identitysourceparameters)
     */
    override fun identitySourceParameters(): Any = unwrap(this).getIdentitySourceParameters()

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-identitysource.html#cfn-mpa-identitysource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentitySourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnIdentitySourceProps):
        CfnIdentitySourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdentitySourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentitySourceProps):
        software.amazon.awscdk.services.mpa.CfnIdentitySourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mpa.CfnIdentitySourceProps
  }
}
