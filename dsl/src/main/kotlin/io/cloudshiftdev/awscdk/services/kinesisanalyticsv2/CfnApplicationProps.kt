package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  /**
   * Use this parameter to configure the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
   */
  public fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

  /**
   * The description of the application.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
   */
  public fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  /**
   * Describes the maintenance configuration for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
   */
  public fun applicationMaintenanceConfiguration(): Any? =
      unwrap(this).getApplicationMaintenanceConfiguration()

  /**
   * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
   *
   * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
   */
  public fun applicationMode(): String? = unwrap(this).getApplicationMode()

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
   */
  public fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

  /**
   * The runtime environment for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
   */
  public fun runtimeEnvironment(): String

  /**
   * Specifies the IAM role that the application uses to access external resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
   */
  public fun serviceExecutionRole(): String

  /**
   * A list of one or more tags to assign to the application.
   *
   * A tag is a key-value pair that identifies an application. Note that the maximum number of
   * application tags includes system tags. The maximum number of user-defined application tags is 50.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    public fun applicationConfiguration(applicationConfiguration: IResolvable)

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    public
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty)

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0311262f37fdea8610ef532b83f150fa088cd6b977e7d5f8506f2aec9e87187f")
    public
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param applicationDescription The description of the application.
     */
    public fun applicationDescription(applicationDescription: String)

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable)

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty)

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6e8d4ae0d711726a391dceb350c3c6278c0987adacf55593e14fbe3d9f6b95b")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
     * mode to `INTERACTIVE` .
     * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
     */
    public fun applicationMode(applicationMode: String)

    /**
     * @param applicationName The name of the application.
     */
    public fun applicationName(applicationName: String)

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    public fun runConfiguration(runConfiguration: IResolvable)

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    public fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty)

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a848636436393563579e51b9e873c3e51744a04ea6909c18c9771bd03591e8fa")
    public
        fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty.Builder.() -> Unit)

    /**
     * @param runtimeEnvironment The runtime environment for the application. 
     */
    public fun runtimeEnvironment(runtimeEnvironment: String)

    /**
     * @param serviceExecutionRole Specifies the IAM role that the application uses to access
     * external resources. 
     */
    public fun serviceExecutionRole(serviceExecutionRole: String)

    /**
     * @param tags A list of one or more tags to assign to the application.
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of one or more tags to assign to the application.
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps.builder()

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    override
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(CfnApplication.ApplicationConfigurationProperty::unwrap))
    }

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0311262f37fdea8610ef532b83f150fa088cd6b977e7d5f8506f2aec9e87187f")
    override
        fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationConfiguration(CfnApplication.ApplicationConfigurationProperty(applicationConfiguration))

    /**
     * @param applicationDescription The description of the application.
     */
    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(CfnApplication.ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6e8d4ae0d711726a391dceb350c3c6278c0987adacf55593e14fbe3d9f6b95b")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(CfnApplication.ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    /**
     * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
     * mode to `INTERACTIVE` .
     * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
     */
    override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    /**
     * @param applicationName The name of the application.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    override fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(CfnApplication.RunConfigurationProperty::unwrap))
    }

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a848636436393563579e51b9e873c3e51744a04ea6909c18c9771bd03591e8fa")
    override
        fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(CfnApplication.RunConfigurationProperty(runConfiguration))

    /**
     * @param runtimeEnvironment The runtime environment for the application. 
     */
    override fun runtimeEnvironment(runtimeEnvironment: String) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    /**
     * @param serviceExecutionRole Specifies the IAM role that the application uses to access
     * external resources. 
     */
    override fun serviceExecutionRole(serviceExecutionRole: String) {
      cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    /**
     * @param tags A list of one or more tags to assign to the application.
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of one or more tags to assign to the application.
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     */
    override fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

    /**
     * The description of the application.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
     */
    override fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    /**
     * Describes the maintenance configuration for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     */
    override fun applicationMaintenanceConfiguration(): Any? =
        unwrap(this).getApplicationMaintenanceConfiguration()

    /**
     * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
     *
     * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
     */
    override fun applicationMode(): String? = unwrap(this).getApplicationMode()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     */
    override fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

    /**
     * The runtime environment for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
     */
    override fun runtimeEnvironment(): String = unwrap(this).getRuntimeEnvironment()

    /**
     * Specifies the IAM role that the application uses to access external resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
     */
    override fun serviceExecutionRole(): String = unwrap(this).getServiceExecutionRole()

    /**
     * A list of one or more tags to assign to the application.
     *
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationProps
  }
}
