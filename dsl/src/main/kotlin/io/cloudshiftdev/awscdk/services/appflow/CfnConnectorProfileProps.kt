package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectorProfileProps {
  /**
   * Indicates the connection mode and if it is public or private.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
   */
  public fun connectionMode(): String

  /**
   * The label for the connector profile being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
   */
  public fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  /**
   * Defines the connector-specific configuration and credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
   */
  public fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

  /**
   * The name of the connector profile.
   *
   * The name is unique for each `ConnectorProfile` in the AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
   */
  public fun connectorProfileName(): String

  /**
   * The type of connector, such as Salesforce, Amplitude, and so on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
   */
  public fun connectorType(): String

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   *
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
   */
  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * A builder for [CfnConnectorProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    public fun connectionMode(connectionMode: String)

    /**
     * @param connectorLabel The label for the connector profile being created.
     */
    public fun connectorLabel(connectorLabel: String)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    public fun connectorProfileConfig(connectorProfileConfig: IResolvable)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty)

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit)

    /**
     * @param connectorProfileName The name of the connector profile. 
     * The name is unique for each `ConnectorProfile` in the AWS account .
     */
    public fun connectorProfileName(connectorProfileName: String)

    /**
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    public fun connectorType(connectorType: String)

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    public fun kmsArn(kmsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.Builder
        = software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.builder()

    /**
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    override fun connectionMode(connectionMode: String) {
      cdkBuilder.connectionMode(connectionMode)
    }

    /**
     * @param connectorLabel The label for the connector profile being created.
     */
    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    override fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(IResolvable::unwrap))
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(CfnConnectorProfile.ConnectorProfileConfigProperty::unwrap))
    }

    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProfileConfig(CfnConnectorProfile.ConnectorProfileConfigProperty(connectorProfileConfig))

    /**
     * @param connectorProfileName The name of the connector profile. 
     * The name is unique for each `ConnectorProfile` in the AWS account .
     */
    override fun connectorProfileName(connectorProfileName: String) {
      cdkBuilder.connectorProfileName(connectorProfileName)
    }

    /**
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    override fun connectorType(connectorType: String) {
      cdkBuilder.connectorType(connectorType)
    }

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps,
  ) : CdkObject(cdkObject), CfnConnectorProfileProps {
    /**
     * Indicates the connection mode and if it is public or private.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
     */
    override fun connectionMode(): String = unwrap(this).getConnectionMode()

    /**
     * The label for the connector profile being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
     */
    override fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     */
    override fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

    /**
     * The name of the connector profile.
     *
     * The name is unique for each `ConnectorProfile` in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
     */
    override fun connectorProfileName(): String = unwrap(this).getConnectorProfileName()

    /**
     * The type of connector, such as Salesforce, Amplitude, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
     */
    override fun connectorType(): String = unwrap(this).getConnectorType()

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
     */
    override fun kmsArn(): String? = unwrap(this).getKmsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps):
        CfnConnectorProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProfileProps):
        software.amazon.awscdk.services.appflow.CfnConnectorProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
  }
}
