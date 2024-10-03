@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnSecurityControl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnSecurityControlProps cfnSecurityControlProps = CfnSecurityControlProps.builder()
 * .parameters(Map.of(
 * "parametersKey", ParameterConfigurationProperty.builder()
 * .valueType("valueType")
 * // the properties below are optional
 * .value(ParameterValueProperty.builder()
 * .boolean(false)
 * .double(123)
 * .enum("enum")
 * .enumList(List.of("enumList"))
 * .integer(123)
 * .integerList(List.of(123))
 * .string("string")
 * .stringList(List.of("stringList"))
 * .build())
 * .build()))
 * // the properties below are optional
 * .lastUpdateReason("lastUpdateReason")
 * .securityControlArn("securityControlArn")
 * .securityControlId("securityControlId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html)
 */
public interface CfnSecurityControlProps {
  /**
   * The most recent reason for updating the customizable properties of a security control.
   *
   * This differs from the `UpdateReason` field of the
   * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
   * API, which tracks the reason for updating the enablement status of a control. This field accepts
   * alphanumeric characters in addition to white spaces, dashes, and underscores.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-lastupdatereason)
   */
  public fun lastUpdateReason(): String? = unwrap(this).getLastUpdateReason()

  /**
   * An object that identifies the name of a control parameter, its current value, and whether it
   * has been customized.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
   */
  public fun parameters(): Any

  /**
   * The Amazon Resource Name (ARN) for a security control across standards, such as
   * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
   * mention a specific standard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolarn)
   */
  public fun securityControlArn(): String? = unwrap(this).getSecurityControlArn()

  /**
   * The unique identifier of a security control across standards.
   *
   * Values for this field typically consist of an AWS service name and a number, such as
   * APIGateway.3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolid)
   */
  public fun securityControlId(): String? = unwrap(this).getSecurityControlId()

  /**
   * A builder for [CfnSecurityControlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lastUpdateReason The most recent reason for updating the customizable properties of a
     * security control.
     * This differs from the `UpdateReason` field of the
     * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
     * API, which tracks the reason for updating the enablement status of a control. This field accepts
     * alphanumeric characters in addition to white spaces, dashes, and underscores.
     */
    public fun lastUpdateReason(lastUpdateReason: String)

    /**
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param securityControlArn The Amazon Resource Name (ARN) for a security control across
     * standards, such as `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This
     * parameter doesn't mention a specific standard.
     */
    public fun securityControlArn(securityControlArn: String)

    /**
     * @param securityControlId The unique identifier of a security control across standards.
     * Values for this field typically consist of an AWS service name and a number, such as
     * APIGateway.3.
     */
    public fun securityControlId(securityControlId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnSecurityControlProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnSecurityControlProps.builder()

    /**
     * @param lastUpdateReason The most recent reason for updating the customizable properties of a
     * security control.
     * This differs from the `UpdateReason` field of the
     * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
     * API, which tracks the reason for updating the enablement status of a control. This field accepts
     * alphanumeric characters in addition to white spaces, dashes, and underscores.
     */
    override fun lastUpdateReason(lastUpdateReason: String) {
      cdkBuilder.lastUpdateReason(lastUpdateReason)
    }

    /**
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters An object that identifies the name of a control parameter, its current
     * value, and whether it has been customized. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param securityControlArn The Amazon Resource Name (ARN) for a security control across
     * standards, such as `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This
     * parameter doesn't mention a specific standard.
     */
    override fun securityControlArn(securityControlArn: String) {
      cdkBuilder.securityControlArn(securityControlArn)
    }

    /**
     * @param securityControlId The unique identifier of a security control across standards.
     * Values for this field typically consist of an AWS service name and a number, such as
     * APIGateway.3.
     */
    override fun securityControlId(securityControlId: String) {
      cdkBuilder.securityControlId(securityControlId)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnSecurityControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControlProps,
  ) : CdkObject(cdkObject),
      CfnSecurityControlProps {
    /**
     * The most recent reason for updating the customizable properties of a security control.
     *
     * This differs from the `UpdateReason` field of the
     * [`BatchUpdateStandardsControlAssociations`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html)
     * API, which tracks the reason for updating the enablement status of a control. This field accepts
     * alphanumeric characters in addition to white spaces, dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-lastupdatereason)
     */
    override fun lastUpdateReason(): String? = unwrap(this).getLastUpdateReason()

    /**
     * An object that identifies the name of a control parameter, its current value, and whether it
     * has been customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * `arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1` . This parameter doesn't
     * mention a specific standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolarn)
     */
    override fun securityControlArn(): String? = unwrap(this).getSecurityControlArn()

    /**
     * The unique identifier of a security control across standards.
     *
     * Values for this field typically consist of an AWS service name and a number, such as
     * APIGateway.3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-securitycontrol.html#cfn-securityhub-securitycontrol-securitycontrolid)
     */
    override fun securityControlId(): String? = unwrap(this).getSecurityControlId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnSecurityControlProps):
        CfnSecurityControlProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSecurityControlProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityControlProps):
        software.amazon.awscdk.services.securityhub.CfnSecurityControlProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnSecurityControlProps
  }
}
