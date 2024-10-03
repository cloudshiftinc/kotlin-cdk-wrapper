@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRoleAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnRoleAliasProps cfnRoleAliasProps = CfnRoleAliasProps.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .credentialDurationSeconds(123)
 * .roleAlias("roleAlias")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html)
 */
public interface CfnRoleAliasProps {
  /**
   * The number of seconds for which the credential is valid.
   *
   * Default: - 3600
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-credentialdurationseconds)
   */
  public fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

  /**
   * The role alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolealias)
   */
  public fun roleAlias(): String? = unwrap(this).getRoleAlias()

  /**
   * The role ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolearn)
   */
  public fun roleArn(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRoleAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param credentialDurationSeconds The number of seconds for which the credential is valid.
     */
    public fun credentialDurationSeconds(credentialDurationSeconds: Number)

    /**
     * @param roleAlias The role alias.
     */
    public fun roleAlias(roleAlias: String)

    /**
     * @param roleArn The role ARN. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnRoleAliasProps.Builder =
        software.amazon.awscdk.services.iot.CfnRoleAliasProps.builder()

    /**
     * @param credentialDurationSeconds The number of seconds for which the credential is valid.
     */
    override fun credentialDurationSeconds(credentialDurationSeconds: Number) {
      cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
    }

    /**
     * @param roleAlias The role alias.
     */
    override fun roleAlias(roleAlias: String) {
      cdkBuilder.roleAlias(roleAlias)
    }

    /**
     * @param roleArn The role ARN. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnRoleAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnRoleAliasProps,
  ) : CdkObject(cdkObject),
      CfnRoleAliasProps {
    /**
     * The number of seconds for which the credential is valid.
     *
     * Default: - 3600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-credentialdurationseconds)
     */
    override fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

    /**
     * The role alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolealias)
     */
    override fun roleAlias(): String? = unwrap(this).getRoleAlias()

    /**
     * The role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoleAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnRoleAliasProps):
        CfnRoleAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRoleAliasProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoleAliasProps):
        software.amazon.awscdk.services.iot.CfnRoleAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnRoleAliasProps
  }
}
