@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a role alias.
 *
 * Requires permission to access the
 * [CreateRoleAlias](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnRoleAlias cfnRoleAlias = CfnRoleAlias.Builder.create(this, "MyCfnRoleAlias")
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
public open class CfnRoleAlias(
  cdkObject: software.amazon.awscdk.services.iot.CfnRoleAlias,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoleAliasProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnRoleAlias(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRoleAliasProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoleAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRoleAliasProps(props)
  )

  /**
   * The role alias ARN.
   */
  public open fun attrRoleAliasArn(): String = unwrap(this).getAttrRoleAliasArn()

  /**
   * The number of seconds for which the credential is valid.
   */
  public open fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

  /**
   * The number of seconds for which the credential is valid.
   */
  public open fun credentialDurationSeconds(`value`: Number) {
    unwrap(this).setCredentialDurationSeconds(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The role alias.
   */
  public open fun roleAlias(): String? = unwrap(this).getRoleAlias()

  /**
   * The role alias.
   */
  public open fun roleAlias(`value`: String) {
    unwrap(this).setRoleAlias(`value`)
  }

  /**
   * The role ARN.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The role ARN.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnRoleAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of seconds for which the credential is valid.
     *
     * Default: - 3600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-credentialdurationseconds)
     * @param credentialDurationSeconds The number of seconds for which the credential is valid. 
     */
    public fun credentialDurationSeconds(credentialDurationSeconds: Number)

    /**
     * The role alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolealias)
     * @param roleAlias The role alias. 
     */
    public fun roleAlias(roleAlias: String)

    /**
     * The role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolearn)
     * @param roleArn The role ARN. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnRoleAlias.Builder =
        software.amazon.awscdk.services.iot.CfnRoleAlias.Builder.create(scope, id)

    /**
     * The number of seconds for which the credential is valid.
     *
     * Default: - 3600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-credentialdurationseconds)
     * @param credentialDurationSeconds The number of seconds for which the credential is valid. 
     */
    override fun credentialDurationSeconds(credentialDurationSeconds: Number) {
      cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
    }

    /**
     * The role alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolealias)
     * @param roleAlias The role alias. 
     */
    override fun roleAlias(roleAlias: String) {
      cdkBuilder.roleAlias(roleAlias)
    }

    /**
     * The role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-rolearn)
     * @param roleArn The role ARN. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html#cfn-iot-rolealias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnRoleAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnRoleAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoleAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoleAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnRoleAlias): CfnRoleAlias =
        CfnRoleAlias(cdkObject)

    internal fun unwrap(wrapped: CfnRoleAlias): software.amazon.awscdk.services.iot.CfnRoleAlias =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnRoleAlias
  }
}
