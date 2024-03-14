package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStandard internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.securityhub.CfnStandard,
) : CfnResource(cdkObject), IInspectable {
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
  public open fun disabledStandardsControls(__idx_ac66f0: List<Any>) {
    unwrap(this).setDisabledStandardsControls(__idx_ac66f0)
  }

  /**
   * Specifies which controls are to be disabled in a standard.
   */
  public open fun disabledStandardsControls(vararg __idx_ac66f0: Any): Unit =
      disabledStandardsControls(__idx_ac66f0.toList())

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
      cdkBuilder.disabledStandardsControls(disabledStandardsControls)
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
        software.amazon.awscdk.services.securityhub.CfnStandard = wrapped.cdkObject
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty,
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
          StandardsControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardsControlProperty):
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securityhub.CfnStandard.StandardsControlProperty
    }
  }
}
