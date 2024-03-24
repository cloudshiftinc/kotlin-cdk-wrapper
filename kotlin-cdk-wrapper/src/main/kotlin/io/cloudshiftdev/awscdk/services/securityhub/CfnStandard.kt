@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * The `AWS::SecurityHub::Standard` resource specifies the enablement of a security standard.
 *
 * The standard is identified by the `StandardsArn` property. To view a list of Security Hub
 * standards and their Amazon Resource Names (ARNs), use the
 * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
 * API operation.
 *
 * You must create a separate `AWS::SecurityHub::Standard` resource for each standard that you want
 * to enable.
 *
 * For more information about Security Hub standards, see [Security Hub standards
 * reference](https://docs.aws.amazon.com/securityhub/latest/userguide/standards-reference.html) in the
 * *AWS Security Hub User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnStandard cfnStandard = CfnStandard.Builder.create(this, "MyCfnStandard")
 * .standardsArn("standardsArn")
 * // the properties below are optional
 * .disabledStandardsControls(List.of(StandardsControlProperty.builder()
 * .standardsControlArn("standardsControlArn")
 * // the properties below are optional
 * .reason("reason")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
 */
public open class CfnStandard(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStandardProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnStandard(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnStandardProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStandardProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStandardProps(props)
  )

  /**
   * The ARN of a resource that represents your subscription to a supported standard.
   */
  public open fun attrStandardsSubscriptionArn(): String =
      unwrap(this).getAttrStandardsSubscriptionArn()

  /**
   * Specifies which controls are to be disabled in a standard.
   */
  public open fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

  /**
   * Specifies which controls are to be disabled in a standard.
   */
  public open fun disabledStandardsControls(`value`: IResolvable) {
    unwrap(this).setDisabledStandardsControls(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies which controls are to be disabled in a standard.
   */
  public open fun disabledStandardsControls(`value`: List<Any>) {
    unwrap(this).setDisabledStandardsControls(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies which controls are to be disabled in a standard.
   */
  public open fun disabledStandardsControls(vararg `value`: Any): Unit =
      disabledStandardsControls(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN of the standard that you want to enable.
   */
  public open fun standardsArn(): String = unwrap(this).getStandardsArn()

  /**
   * The ARN of the standard that you want to enable.
   */
  public open fun standardsArn(`value`: String) {
    unwrap(this).setStandardsArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnStandard].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    public fun disabledStandardsControls(disabledStandardsControls: IResolvable)

    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    public fun disabledStandardsControls(disabledStandardsControls: List<Any>)

    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    public fun disabledStandardsControls(vararg disabledStandardsControls: Any)

    /**
     * The ARN of the standard that you want to enable.
     *
     * To view a list of available Security Hub standards and their ARNs, use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-standardsarn)
     * @param standardsArn The ARN of the standard that you want to enable. 
     */
    public fun standardsArn(standardsArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnStandard.Builder =
        software.amazon.awscdk.services.securityhub.CfnStandard.Builder.create(scope, id)

    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    override fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls.let(IResolvable::unwrap))
    }

    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    override fun disabledStandardsControls(disabledStandardsControls: List<Any>) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
     */
    override fun disabledStandardsControls(vararg disabledStandardsControls: Any): Unit =
        disabledStandardsControls(disabledStandardsControls.toList())

    /**
     * The ARN of the standard that you want to enable.
     *
     * To view a list of available Security Hub standards and their ARNs, use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-standardsarn)
     * @param standardsArn The ARN of the standard that you want to enable. 
     */
    override fun standardsArn(standardsArn: String) {
      cdkBuilder.standardsArn(standardsArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnStandard = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnStandard.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStandard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStandard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard):
        CfnStandard = CfnStandard(cdkObject)

    internal fun unwrap(wrapped: CfnStandard):
        software.amazon.awscdk.services.securityhub.CfnStandard = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnStandard
  }

  /**
   * Provides details about an individual security control.
   *
   * For a list of Security Hub controls, see [Security Hub controls
   * reference](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-controls-reference.html)
   * in the *AWS Security Hub User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securityhub.*;
   * StandardsControlProperty standardsControlProperty = StandardsControlProperty.builder()
   * .standardsControlArn("standardsControlArn")
   * // the properties below are optional
   * .reason("reason")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html)
   */
  public interface StandardsControlProperty {
    /**
     * A user-defined reason for changing a control's enablement status in a specified standard.
     *
     * If you are disabling a control, then this property is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html#cfn-securityhub-standard-standardscontrol-reason)
     */
    public fun reason(): String? = unwrap(this).getReason()

    /**
     * The Amazon Resource Name (ARN) of the control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html#cfn-securityhub-standard-standardscontrol-standardscontrolarn)
     */
    public fun standardsControlArn(): String

    /**
     * A builder for [StandardsControlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reason A user-defined reason for changing a control's enablement status in a
       * specified standard.
       * If you are disabling a control, then this property is required.
       */
      public fun reason(reason: String)

      /**
       * @param standardsControlArn The Amazon Resource Name (ARN) of the control. 
       */
      public fun standardsControlArn(standardsControlArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty.Builder =
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty.builder()

      /**
       * @param reason A user-defined reason for changing a control's enablement status in a
       * specified standard.
       * If you are disabling a control, then this property is required.
       */
      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      /**
       * @param standardsControlArn The Amazon Resource Name (ARN) of the control. 
       */
      override fun standardsControlArn(standardsControlArn: String) {
        cdkBuilder.standardsControlArn(standardsControlArn)
      }

      public fun build():
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty,
    ) : CdkObject(cdkObject), StandardsControlProperty {
      /**
       * A user-defined reason for changing a control's enablement status in a specified standard.
       *
       * If you are disabling a control, then this property is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html#cfn-securityhub-standard-standardscontrol-reason)
       */
      override fun reason(): String? = unwrap(this).getReason()

      /**
       * The Amazon Resource Name (ARN) of the control.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html#cfn-securityhub-standard-standardscontrol-standardscontrolarn)
       */
      override fun standardsControlArn(): String = unwrap(this).getStandardsControlArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StandardsControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty):
          StandardsControlProperty = CdkObjectWrappers.wrap(cdkObject) as? StandardsControlProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardsControlProperty):
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty
    }
  }
}
