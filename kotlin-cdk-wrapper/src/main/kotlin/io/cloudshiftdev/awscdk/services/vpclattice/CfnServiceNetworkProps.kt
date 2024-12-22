@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnServiceNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceNetworkProps cfnServiceNetworkProps = CfnServiceNetworkProps.builder()
 * .authType("authType")
 * .name("name")
 * .sharingConfig(SharingConfigProperty.builder()
 * .enabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
 */
public interface CfnServiceNetworkProps {
  /**
   * The type of IAM policy.
   *
   * * `NONE` : The resource does not use an IAM policy. This is the default.
   * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
   * auth policy is required.
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-authtype)
   */
  public fun authType(): String? = unwrap(this).getAuthType()

  /**
   * The name of the service network.
   *
   * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-). You
   * can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
   */
  public fun sharingConfig(): Any? = unwrap(this).getSharingConfig()

  /**
   * The tags for the service network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceNetworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     */
    public fun authType(authType: String)

    /**
     * @param name The name of the service network.
     * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-).
     * You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String)

    /**
     * @param sharingConfig the value to be set.
     */
    public fun sharingConfig(sharingConfig: IResolvable)

    /**
     * @param sharingConfig the value to be set.
     */
    public fun sharingConfig(sharingConfig: CfnServiceNetwork.SharingConfigProperty)

    /**
     * @param sharingConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d994dbc6c74e05db188f67e20b9698ee2959f26500d57649d04cdef547b25cdd")
    public
        fun sharingConfig(sharingConfig: CfnServiceNetwork.SharingConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags for the service network.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the service network.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps.builder()

    /**
     * @param authType The type of IAM policy.
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param name The name of the service network.
     * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-).
     * You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sharingConfig the value to be set.
     */
    override fun sharingConfig(sharingConfig: IResolvable) {
      cdkBuilder.sharingConfig(sharingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sharingConfig the value to be set.
     */
    override fun sharingConfig(sharingConfig: CfnServiceNetwork.SharingConfigProperty) {
      cdkBuilder.sharingConfig(sharingConfig.let(CfnServiceNetwork.SharingConfigProperty.Companion::unwrap))
    }

    /**
     * @param sharingConfig the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d994dbc6c74e05db188f67e20b9698ee2959f26500d57649d04cdef547b25cdd")
    override
        fun sharingConfig(sharingConfig: CfnServiceNetwork.SharingConfigProperty.Builder.() -> Unit):
        Unit = sharingConfig(CfnServiceNetwork.SharingConfigProperty(sharingConfig))

    /**
     * @param tags The tags for the service network.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the service network.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps,
  ) : CdkObject(cdkObject),
      CfnServiceNetworkProps {
    /**
     * The type of IAM policy.
     *
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-authtype)
     */
    override fun authType(): String? = unwrap(this).getAuthType()

    /**
     * The name of the service network.
     *
     * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-).
     * You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     */
    override fun sharingConfig(): Any? = unwrap(this).getSharingConfig()

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps):
        CfnServiceNetworkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServiceNetworkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps
  }
}
