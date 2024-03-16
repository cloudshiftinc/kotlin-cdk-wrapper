@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStandard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnStandardProps cfnStandardProps = CfnStandardProps.builder()
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
public interface CfnStandardProps {
  /**
   * Specifies which controls are to be disabled in a standard.
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
   */
  public fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

  /**
   * The ARN of the standard that you want to enable.
   *
   * To view a list of available Security Hub standards and their ARNs, use the
   * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-standardsarn)
   */
  public fun standardsArn(): String

  /**
   * A builder for [CfnStandardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    public fun disabledStandardsControls(disabledStandardsControls: IResolvable)

    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    public fun disabledStandardsControls(disabledStandardsControls: List<Any>)

    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    public fun disabledStandardsControls(vararg disabledStandardsControls: Any)

    /**
     * @param standardsArn The ARN of the standard that you want to enable. 
     * To view a list of available Security Hub standards and their ARNs, use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     */
    public fun standardsArn(standardsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnStandardProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnStandardProps.builder()

    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    override fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls.let(IResolvable::unwrap))
    }

    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    override fun disabledStandardsControls(disabledStandardsControls: List<Any>) {
      cdkBuilder.disabledStandardsControls(disabledStandardsControls)
    }

    /**
     * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
     * *Maximum* : `100`
     */
    override fun disabledStandardsControls(vararg disabledStandardsControls: Any): Unit =
        disabledStandardsControls(disabledStandardsControls.toList())

    /**
     * @param standardsArn The ARN of the standard that you want to enable. 
     * To view a list of available Security Hub standards and their ARNs, use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     */
    override fun standardsArn(standardsArn: String) {
      cdkBuilder.standardsArn(standardsArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnStandardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnStandardProps,
  ) : CdkObject(cdkObject), CfnStandardProps {
    /**
     * Specifies which controls are to be disabled in a standard.
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
     */
    override fun disabledStandardsControls(): Any? = unwrap(this).getDisabledStandardsControls()

    /**
     * The ARN of the standard that you want to enable.
     *
     * To view a list of available Security Hub standards and their ARNs, use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-standardsarn)
     */
    override fun standardsArn(): String = unwrap(this).getStandardsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStandardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnStandardProps):
        CfnStandardProps = CdkObjectWrappers.wrap(cdkObject) as CfnStandardProps

    internal fun unwrap(wrapped: CfnStandardProps):
        software.amazon.awscdk.services.securityhub.CfnStandardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnStandardProps
  }
}
