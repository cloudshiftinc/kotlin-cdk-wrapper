@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a framework with one or more controls.
 *
 * A framework is a collection of controls that you can use to evaluate your backup practices. By
 * using pre-built customizable controls to define your policies, you can evaluate whether your backup
 * practices comply with your policies and which resources are not yet in compliance.
 *
 * For a sample AWS CloudFormation template, see the [AWS Backup Developer
 * Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/bam-cfn-integration.html#bam-cfn-frameworks-template)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object controlScope;
 * CfnFramework cfnFramework = CfnFramework.Builder.create(this, "MyCfnFramework")
 * .frameworkControls(List.of(FrameworkControlProperty.builder()
 * .controlName("controlName")
 * // the properties below are optional
 * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .controlScope(controlScope)
 * .build()))
 * // the properties below are optional
 * .frameworkDescription("frameworkDescription")
 * .frameworkName("frameworkName")
 * .frameworkTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
 */
public open class CfnFramework(
  cdkObject: software.amazon.awscdk.services.backup.CfnFramework,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFrameworkProps,
  ) :
      this(software.amazon.awscdk.services.backup.CfnFramework(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFrameworkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFrameworkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFrameworkProps(props)
  )

  /**
   * The UTC time when you created your framework.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Depolyment status refers to whether your framework has completed deployment.
   *
   * This status is usually `Completed` , but might also be `Create in progress` or another status.
   * For a list of statuses, see [Framework compliance
   * status](https://docs.aws.amazon.com/aws-backup/latest/devguide/viewing-frameworks.html) in the
   * *Developer Guide* .
   */
  public open fun attrDeploymentStatus(): String = unwrap(this).getAttrDeploymentStatus()

  /**
   * The Amazon Resource Name (ARN) of your framework.
   */
  public open fun attrFrameworkArn(): String = unwrap(this).getAttrFrameworkArn()

  /**
   * Framework status refers to whether you have turned on resource tracking for all of your
   * resources.
   *
   * This status is `Active` when you turn on all resources the framework evaluates. For other
   * statuses and steps to correct them, see [Framework compliance
   * status](https://docs.aws.amazon.com/aws-backup/latest/devguide/viewing-frameworks.html) in the
   * *Developer Guide* .
   */
  public open fun attrFrameworkStatus(): String = unwrap(this).getAttrFrameworkStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Contains detailed information about all of the controls of a framework.
   */
  public open fun frameworkControls(): Any = unwrap(this).getFrameworkControls()

  /**
   * Contains detailed information about all of the controls of a framework.
   */
  public open fun frameworkControls(`value`: IResolvable) {
    unwrap(this).setFrameworkControls(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains detailed information about all of the controls of a framework.
   */
  public open fun frameworkControls(`value`: List<Any>) {
    unwrap(this).setFrameworkControls(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Contains detailed information about all of the controls of a framework.
   */
  public open fun frameworkControls(vararg `value`: Any): Unit = frameworkControls(`value`.toList())

  /**
   * An optional description of the framework with a maximum 1,024 characters.
   */
  public open fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

  /**
   * An optional description of the framework with a maximum 1,024 characters.
   */
  public open fun frameworkDescription(`value`: String) {
    unwrap(this).setFrameworkDescription(`value`)
  }

  /**
   * The unique name of a framework.
   */
  public open fun frameworkName(): String? = unwrap(this).getFrameworkName()

  /**
   * The unique name of a framework.
   */
  public open fun frameworkName(`value`: String) {
    unwrap(this).setFrameworkName(`value`)
  }

  /**
   * The tags to assign to your framework.
   */
  public open fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap)
      ?: emptyList()

  /**
   * The tags to assign to your framework.
   */
  public open fun frameworkTags(`value`: List<CfnTag>) {
    unwrap(this).setFrameworkTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to assign to your framework.
   */
  public open fun frameworkTags(vararg `value`: CfnTag): Unit = frameworkTags(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.CfnFramework].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    public fun frameworkControls(frameworkControls: IResolvable)

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    public fun frameworkControls(frameworkControls: List<Any>)

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    public fun frameworkControls(vararg frameworkControls: Any)

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkdescription)
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     * characters. 
     */
    public fun frameworkDescription(frameworkDescription: String)

    /**
     * The unique name of a framework.
     *
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkname)
     * @param frameworkName The unique name of a framework. 
     */
    public fun frameworkName(frameworkName: String)

    /**
     * The tags to assign to your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     * @param frameworkTags The tags to assign to your framework. 
     */
    public fun frameworkTags(frameworkTags: List<CfnTag>)

    /**
     * The tags to assign to your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     * @param frameworkTags The tags to assign to your framework. 
     */
    public fun frameworkTags(vararg frameworkTags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnFramework.Builder =
        software.amazon.awscdk.services.backup.CfnFramework.Builder.create(scope, id)

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    override fun frameworkControls(frameworkControls: IResolvable) {
      cdkBuilder.frameworkControls(frameworkControls.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    override fun frameworkControls(frameworkControls: List<Any>) {
      cdkBuilder.frameworkControls(frameworkControls.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     * @param frameworkControls Contains detailed information about all of the controls of a
     * framework. 
     */
    override fun frameworkControls(vararg frameworkControls: Any): Unit =
        frameworkControls(frameworkControls.toList())

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkdescription)
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     * characters. 
     */
    override fun frameworkDescription(frameworkDescription: String) {
      cdkBuilder.frameworkDescription(frameworkDescription)
    }

    /**
     * The unique name of a framework.
     *
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkname)
     * @param frameworkName The unique name of a framework. 
     */
    override fun frameworkName(frameworkName: String) {
      cdkBuilder.frameworkName(frameworkName)
    }

    /**
     * The tags to assign to your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     * @param frameworkTags The tags to assign to your framework. 
     */
    override fun frameworkTags(frameworkTags: List<CfnTag>) {
      cdkBuilder.frameworkTags(frameworkTags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to assign to your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     * @param frameworkTags The tags to assign to your framework. 
     */
    override fun frameworkTags(vararg frameworkTags: CfnTag): Unit =
        frameworkTags(frameworkTags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnFramework = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnFramework.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFramework {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFramework(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework): CfnFramework
        = CfnFramework(cdkObject)

    internal fun unwrap(wrapped: CfnFramework): software.amazon.awscdk.services.backup.CfnFramework
        = wrapped.cdkObject as software.amazon.awscdk.services.backup.CfnFramework
  }

  /**
   * The parameters for a control.
   *
   * A control can have zero, one, or more than one parameter. An example of a control with two
   * parameters is: "backup plan frequency is at least `daily` and the retention period is at least `1
   * year` ". The first parameter is `daily` . The second parameter is `1 year` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * ControlInputParameterProperty controlInputParameterProperty =
   * ControlInputParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html)
   */
  public interface ControlInputParameterProperty {
    /**
     * The name of a parameter, for example, `BackupPlanFrequency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html#cfn-backup-framework-controlinputparameter-parametername)
     */
    public fun parameterName(): String

    /**
     * The value of parameter, for example, `hourly` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html#cfn-backup-framework-controlinputparameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ControlInputParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName The name of a parameter, for example, `BackupPlanFrequency` . 
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The value of parameter, for example, `hourly` . 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.builder()

      /**
       * @param parameterName The name of a parameter, for example, `BackupPlanFrequency` . 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The value of parameter, for example, `hourly` . 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty,
    ) : CdkObject(cdkObject), ControlInputParameterProperty {
      /**
       * The name of a parameter, for example, `BackupPlanFrequency` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html#cfn-backup-framework-controlinputparameter-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * The value of parameter, for example, `hourly` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html#cfn-backup-framework-controlinputparameter-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ControlInputParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty):
          ControlInputParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ControlInputParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlInputParameterProperty):
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty
    }
  }

  /**
   * A framework consists of one or more controls.
   *
   * Each control has its own control scope. The control scope can include one or more resource
   * types, a combination of a tag key and value, or a combination of one resource type and one
   * resource ID. If no scope is specified, evaluations for the rule are triggered when any resource in
   * your recording group changes in configuration.
   *
   *
   * To set a control scope that includes all of a particular resource, leave the `ControlScope`
   * empty or do not pass it when calling `CreateFramework` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * ControlScopeProperty controlScopeProperty = ControlScopeProperty.builder()
   * .complianceResourceIds(List.of("complianceResourceIds"))
   * .complianceResourceTypes(List.of("complianceResourceTypes"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html)
   */
  public interface ControlScopeProperty {
    /**
     * The ID of the only AWS resource that you want your control scope to contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-complianceresourceids)
     */
    public fun complianceResourceIds(): List<String> = unwrap(this).getComplianceResourceIds() ?:
        emptyList()

    /**
     * Describes whether the control scope includes one or more types of resources, such as `EFS` or
     * `RDS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-complianceresourcetypes)
     */
    public fun complianceResourceTypes(): List<String> = unwrap(this).getComplianceResourceTypes()
        ?: emptyList()

    /**
     * The tag key-value pair applied to those AWS resources that you want to trigger an evaluation
     * for a rule.
     *
     * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be
     * an empty string if you are creating or editing a framework from the console (though the value
     * can be an empty string when included in a CloudFormation template).
     *
     * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [ControlScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param complianceResourceIds The ID of the only AWS resource that you want your control
       * scope to contain.
       */
      public fun complianceResourceIds(complianceResourceIds: List<String>)

      /**
       * @param complianceResourceIds The ID of the only AWS resource that you want your control
       * scope to contain.
       */
      public fun complianceResourceIds(vararg complianceResourceIds: String)

      /**
       * @param complianceResourceTypes Describes whether the control scope includes one or more
       * types of resources, such as `EFS` or `RDS` .
       */
      public fun complianceResourceTypes(complianceResourceTypes: List<String>)

      /**
       * @param complianceResourceTypes Describes whether the control scope includes one or more
       * types of resources, such as `EFS` or `RDS` .
       */
      public fun complianceResourceTypes(vararg complianceResourceTypes: String)

      /**
       * @param tags The tag key-value pair applied to those AWS resources that you want to trigger
       * an evaluation for a rule.
       * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot
       * be an empty string if you are creating or editing a framework from the console (though the
       * value can be an empty string when included in a CloudFormation template).
       *
       * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tag key-value pair applied to those AWS resources that you want to trigger
       * an evaluation for a rule.
       * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot
       * be an empty string if you are creating or editing a framework from the console (though the
       * value can be an empty string when included in a CloudFormation template).
       *
       * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty.Builder =
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty.builder()

      /**
       * @param complianceResourceIds The ID of the only AWS resource that you want your control
       * scope to contain.
       */
      override fun complianceResourceIds(complianceResourceIds: List<String>) {
        cdkBuilder.complianceResourceIds(complianceResourceIds)
      }

      /**
       * @param complianceResourceIds The ID of the only AWS resource that you want your control
       * scope to contain.
       */
      override fun complianceResourceIds(vararg complianceResourceIds: String): Unit =
          complianceResourceIds(complianceResourceIds.toList())

      /**
       * @param complianceResourceTypes Describes whether the control scope includes one or more
       * types of resources, such as `EFS` or `RDS` .
       */
      override fun complianceResourceTypes(complianceResourceTypes: List<String>) {
        cdkBuilder.complianceResourceTypes(complianceResourceTypes)
      }

      /**
       * @param complianceResourceTypes Describes whether the control scope includes one or more
       * types of resources, such as `EFS` or `RDS` .
       */
      override fun complianceResourceTypes(vararg complianceResourceTypes: String): Unit =
          complianceResourceTypes(complianceResourceTypes.toList())

      /**
       * @param tags The tag key-value pair applied to those AWS resources that you want to trigger
       * an evaluation for a rule.
       * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot
       * be an empty string if you are creating or editing a framework from the console (though the
       * value can be an empty string when included in a CloudFormation template).
       *
       * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
      }

      /**
       * @param tags The tag key-value pair applied to those AWS resources that you want to trigger
       * an evaluation for a rule.
       * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot
       * be an empty string if you are creating or editing a framework from the console (though the
       * value can be an empty string when included in a CloudFormation template).
       *
       * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty,
    ) : CdkObject(cdkObject), ControlScopeProperty {
      /**
       * The ID of the only AWS resource that you want your control scope to contain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-complianceresourceids)
       */
      override fun complianceResourceIds(): List<String> = unwrap(this).getComplianceResourceIds()
          ?: emptyList()

      /**
       * Describes whether the control scope includes one or more types of resources, such as `EFS`
       * or `RDS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-complianceresourcetypes)
       */
      override fun complianceResourceTypes(): List<String> =
          unwrap(this).getComplianceResourceTypes() ?: emptyList()

      /**
       * The tag key-value pair applied to those AWS resources that you want to trigger an
       * evaluation for a rule.
       *
       * A maximum of one key-value pair can be provided. The tag value is optional, but it cannot
       * be an empty string if you are creating or editing a framework from the console (though the
       * value can be an empty string when included in a CloudFormation template).
       *
       * The structure to assign a tag is: `[{"Key":"string","Value":"string"}]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html#cfn-backup-framework-controlscope-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ControlScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty):
          ControlScopeProperty = CdkObjectWrappers.wrap(cdkObject) as? ControlScopeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlScopeProperty):
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty
    }
  }

  /**
   * Contains detailed information about all of the controls of a framework.
   *
   * Each framework must contain at least one control.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.backup.*;
   * Object controlScope;
   * FrameworkControlProperty frameworkControlProperty = FrameworkControlProperty.builder()
   * .controlName("controlName")
   * // the properties below are optional
   * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .controlScope(controlScope)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html)
   */
  public interface FrameworkControlProperty {
    /**
     * The name/value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlinputparameters)
     */
    public fun controlInputParameters(): Any? = unwrap(this).getControlInputParameters()

    /**
     * The name of a control.
     *
     * This name is between 1 and 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlname)
     */
    public fun controlName(): String

    /**
     * The scope of a control.
     *
     * The control scope defines what the control will evaluate. Three examples of control scopes
     * are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     *
     * For more information, see [`ControlScope`
     * .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlscope)
     */
    public fun controlScope(): Any? = unwrap(this).getControlScope()

    /**
     * A builder for [FrameworkControlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param controlInputParameters The name/value pairs.
       */
      public fun controlInputParameters(controlInputParameters: IResolvable)

      /**
       * @param controlInputParameters The name/value pairs.
       */
      public fun controlInputParameters(controlInputParameters: List<Any>)

      /**
       * @param controlInputParameters The name/value pairs.
       */
      public fun controlInputParameters(vararg controlInputParameters: Any)

      /**
       * @param controlName The name of a control. 
       * This name is between 1 and 256 characters.
       */
      public fun controlName(controlName: String)

      /**
       * @param controlScope The scope of a control.
       * The control scope defines what the control will evaluate. Three examples of control scopes
       * are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
       *
       * For more information, see [`ControlScope`
       * .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
       */
      public fun controlScope(controlScope: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty.Builder =
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty.builder()

      /**
       * @param controlInputParameters The name/value pairs.
       */
      override fun controlInputParameters(controlInputParameters: IResolvable) {
        cdkBuilder.controlInputParameters(controlInputParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param controlInputParameters The name/value pairs.
       */
      override fun controlInputParameters(controlInputParameters: List<Any>) {
        cdkBuilder.controlInputParameters(controlInputParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param controlInputParameters The name/value pairs.
       */
      override fun controlInputParameters(vararg controlInputParameters: Any): Unit =
          controlInputParameters(controlInputParameters.toList())

      /**
       * @param controlName The name of a control. 
       * This name is between 1 and 256 characters.
       */
      override fun controlName(controlName: String) {
        cdkBuilder.controlName(controlName)
      }

      /**
       * @param controlScope The scope of a control.
       * The control scope defines what the control will evaluate. Three examples of control scopes
       * are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
       *
       * For more information, see [`ControlScope`
       * .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
       */
      override fun controlScope(controlScope: Any) {
        cdkBuilder.controlScope(controlScope)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty,
    ) : CdkObject(cdkObject), FrameworkControlProperty {
      /**
       * The name/value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlinputparameters)
       */
      override fun controlInputParameters(): Any? = unwrap(this).getControlInputParameters()

      /**
       * The name of a control.
       *
       * This name is between 1 and 256 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlname)
       */
      override fun controlName(): String = unwrap(this).getControlName()

      /**
       * The scope of a control.
       *
       * The control scope defines what the control will evaluate. Three examples of control scopes
       * are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
       *
       * For more information, see [`ControlScope`
       * .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html#cfn-backup-framework-frameworkcontrol-controlscope)
       */
      override fun controlScope(): Any? = unwrap(this).getControlScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameworkControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty):
          FrameworkControlProperty = CdkObjectWrappers.wrap(cdkObject) as? FrameworkControlProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameworkControlProperty):
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty
    }
  }
}
