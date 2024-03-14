package io.cloudshiftdev.awscdk.services.kinesisanalytics

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

public interface CfnApplicationV2Props {
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
   * A builder for [CfnApplicationV2Props]
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
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty)

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22c5af73a499c3f2b58faa1fedcf1f381394584b8b3f5530d370d99d09e71b0c")
    public
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit)

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
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty)

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0a93badd4a0bb3809d911f45f4d8b9b5d16962a057b75da3d025c1bd9cde1")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

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
    public fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty)

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b9f12cfd1f2e16744ec3ad8392ba5cd9a2ea9dca2b24dac5db7c1423a9e7e27")
    public
        fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty.Builder.() -> Unit)

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
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.builder()

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
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(CfnApplicationV2.ApplicationConfigurationProperty::unwrap))
    }

    /**
     * @param applicationConfiguration Use this parameter to configure the application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22c5af73a499c3f2b58faa1fedcf1f381394584b8b3f5530d370d99d09e71b0c")
    override
        fun applicationConfiguration(applicationConfiguration: CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationConfiguration(CfnApplicationV2.ApplicationConfigurationProperty(applicationConfiguration))

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
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(CfnApplicationV2.ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    /**
     * @param applicationMaintenanceConfiguration Describes the maintenance configuration for the
     * application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0a93badd4a0bb3809d911f45f4d8b9b5d16962a057b75da3d025c1bd9cde1")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(CfnApplicationV2.ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

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
    override fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(CfnApplicationV2.RunConfigurationProperty::unwrap))
    }

    /**
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b9f12cfd1f2e16744ec3ad8392ba5cd9a2ea9dca2b24dac5db7c1423a9e7e27")
    override
        fun runConfiguration(runConfiguration: CfnApplicationV2.RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(CfnApplicationV2.RunConfigurationProperty(runConfiguration))

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

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props,
  ) : CdkObject(cdkObject), CfnApplicationV2Props {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props):
        CfnApplicationV2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
  }
}
