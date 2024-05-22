@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::Hub` resource specifies the enablement of the AWS Security Hub service in
 * your AWS account .
 *
 * The service is enabled in the current AWS Region or the specified Region. You create a separate
 * `Hub` resource in each Region in which you want to enable Security Hub .
 *
 * When you use this resource to enable Security Hub , default security standards are enabled. To
 * disable default standards, set the `EnableDefaultStandards` property to `false` . You can use the
 * [`AWS::SecurityHub::Standard`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
 * resource to enable additional standards.
 *
 * When you use this resource to enable Security Hub , new controls are automatically enabled for
 * your enabled standards. To disable automatic enablement of new controls, set the
 * `AutoEnableControls` property to `false` .
 *
 * You must create an `AWS::SecurityHub::Hub` resource for an account before you can create other
 * types of Security Hub resources for the account through AWS CloudFormation . Use a [DependsOn
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * , such as `"DependsOn": "Hub"` , to ensure that you've created an `AWS::SecurityHub::Hub` resource
 * before creating other Security Hub resources for an account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * Object tags;
 * CfnHub cfnHub = CfnHub.Builder.create(this, "MyCfnHub")
 * .autoEnableControls(false)
 * .controlFindingGenerator("controlFindingGenerator")
 * .enableDefaultStandards(false)
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html)
 */
public open class CfnHub(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnHub,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.securityhub.CfnHub(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHubProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnHub(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHubProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHubProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHubProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `Hub` resource that was retrieved.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when Security Hub was enabled in your account.
   */
  public open fun attrSubscribedAt(): String = unwrap(this).getAttrSubscribedAt()

  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   */
  public open fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   */
  public open fun autoEnableControls(`value`: Boolean) {
    unwrap(this).setAutoEnableControls(`value`)
  }

  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   */
  public open fun autoEnableControls(`value`: IResolvable) {
    unwrap(this).setAutoEnableControls(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether an account has consolidated control findings turned on or off.
   */
  public open fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

  /**
   * Specifies whether an account has consolidated control findings turned on or off.
   */
  public open fun controlFindingGenerator(`value`: String) {
    unwrap(this).setControlFindingGenerator(`value`)
  }

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   */
  public open fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   */
  public open fun enableDefaultStandards(`value`: Boolean) {
    unwrap(this).setEnableDefaultStandards(`value`)
  }

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   */
  public open fun enableDefaultStandards(`value`: IResolvable) {
    unwrap(this).setEnableDefaultStandards(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnHub].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled. 
     */
    public fun autoEnableControls(autoEnableControls: Boolean)

    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled. 
     */
    public fun autoEnableControls(autoEnableControls: IResolvable)

    /**
     * Specifies whether an account has consolidated control findings turned on or off.
     *
     * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
     * finding for a control check even when the check applies to multiple enabled standards.
     *
     * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
     * findings for a control check when the check applies to multiple enabled standards.
     *
     * The value for this field in a member account matches the value in the administrator account.
     * For accounts that aren't part of an organization, the default value of this field is
     * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-controlfindinggenerator)
     * @param controlFindingGenerator Specifies whether an account has consolidated control findings
     * turned on or off. 
     */
    public fun controlFindingGenerator(controlFindingGenerator: String)

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled. 
     */
    public fun enableDefaultStandards(enableDefaultStandards: Boolean)

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled. 
     */
    public fun enableDefaultStandards(enableDefaultStandards: IResolvable)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHub.Builder =
        software.amazon.awscdk.services.securityhub.CfnHub.Builder.create(scope, id)

    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled. 
     */
    override fun autoEnableControls(autoEnableControls: Boolean) {
      cdkBuilder.autoEnableControls(autoEnableControls)
    }

    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled. 
     */
    override fun autoEnableControls(autoEnableControls: IResolvable) {
      cdkBuilder.autoEnableControls(autoEnableControls.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether an account has consolidated control findings turned on or off.
     *
     * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
     * finding for a control check even when the check applies to multiple enabled standards.
     *
     * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
     * findings for a control check when the check applies to multiple enabled standards.
     *
     * The value for this field in a member account matches the value in the administrator account.
     * For accounts that aren't part of an organization, the default value of this field is
     * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-controlfindinggenerator)
     * @param controlFindingGenerator Specifies whether an account has consolidated control findings
     * turned on or off. 
     */
    override fun controlFindingGenerator(controlFindingGenerator: String) {
      cdkBuilder.controlFindingGenerator(controlFindingGenerator)
    }

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled. 
     */
    override fun enableDefaultStandards(enableDefaultStandards: Boolean) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled. 
     */
    override fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHub = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnHub.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHub {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHub(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHub): CfnHub =
        CfnHub(cdkObject)

    internal fun unwrap(wrapped: CfnHub): software.amazon.awscdk.services.securityhub.CfnHub =
        wrapped.cdkObject as software.amazon.awscdk.services.securityhub.CfnHub
  }
}
