package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnHubProps {
  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   *
   * By default, this is set to `true` , and new controls are enabled automatically. To not
   * automatically enable new controls, set this to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
   */
  public fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

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
   */
  public fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   *
   * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
   * designated standards are automatically enabled in each AWS Region where you enable Security Hub .
   * If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false` .
   *
   * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
   * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
   */
  public fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnHubProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled.
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     */
    public fun autoEnableControls(autoEnableControls: Boolean)

    /**
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled.
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     */
    public fun autoEnableControls(autoEnableControls: IResolvable)

    /**
     * @param controlFindingGenerator Specifies whether an account has consolidated control findings
     * turned on or off.
     * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
     * finding for a control check even when the check applies to multiple enabled standards.
     *
     * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
     * findings for a control check when the check applies to multiple enabled standards.
     *
     * The value for this field in a member account matches the value in the administrator account.
     * For accounts that aren't part of an organization, the default value of this field is
     * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
     */
    public fun controlFindingGenerator(controlFindingGenerator: String)

    /**
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled.
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     */
    public fun enableDefaultStandards(enableDefaultStandards: Boolean)

    /**
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled.
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     */
    public fun enableDefaultStandards(enableDefaultStandards: IResolvable)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHubProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnHubProps.builder()

    /**
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled.
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     */
    override fun autoEnableControls(autoEnableControls: Boolean) {
      cdkBuilder.autoEnableControls(autoEnableControls)
    }

    /**
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     * standards that are enabled.
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     */
    override fun autoEnableControls(autoEnableControls: IResolvable) {
      cdkBuilder.autoEnableControls(autoEnableControls.let(IResolvable::unwrap))
    }

    /**
     * @param controlFindingGenerator Specifies whether an account has consolidated control findings
     * turned on or off.
     * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
     * finding for a control check even when the check applies to multiple enabled standards.
     *
     * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
     * findings for a control check when the check applies to multiple enabled standards.
     *
     * The value for this field in a member account matches the value in the administrator account.
     * For accounts that aren't part of an organization, the default value of this field is
     * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
     */
    override fun controlFindingGenerator(controlFindingGenerator: String) {
      cdkBuilder.controlFindingGenerator(controlFindingGenerator)
    }

    /**
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled.
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     */
    override fun enableDefaultStandards(enableDefaultStandards: Boolean) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    /**
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     * designated as automatically enabled.
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security Hub
     * . If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false`
     * .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     */
    override fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards.let(IResolvable::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHubProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.securityhub.CfnHubProps,
  ) : CdkObject(cdkObject), CfnHubProps {
    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     */
    override fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

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
     */
    override fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

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
     */
    override fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHubProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHubProps):
        CfnHubProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHubProps):
        software.amazon.awscdk.services.securityhub.CfnHubProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.securityhub.CfnHubProps
  }
}
