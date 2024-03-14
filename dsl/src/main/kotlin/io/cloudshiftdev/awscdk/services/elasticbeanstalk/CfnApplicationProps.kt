package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  /**
   * A name for the Elastic Beanstalk application.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the application name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-applicationname)
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * Your description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies an application resource lifecycle configuration to prevent your application from
   * accumulating too many versions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
   */
  public fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName A name for the Elastic Beanstalk application.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun applicationName(applicationName: String)

    /**
     * @param description Your description of the application.
     */
    public fun description(description: String)

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable)

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty)

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2df784e19c008bde534c16beab91231a961c5298ed7467b5f513de7fd516a3cf")
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.builder()

    /**
     * @param applicationName A name for the Elastic Beanstalk application.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param description Your description of the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    override fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(IResolvable::unwrap))
    }

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(CfnApplication.ApplicationResourceLifecycleConfigProperty::unwrap))
    }

    /**
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2df784e19c008bde534c16beab91231a961c5298ed7467b5f513de7fd516a3cf")
    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
        Unit =
        resourceLifecycleConfig(CfnApplication.ApplicationResourceLifecycleConfigProperty(resourceLifecycleConfig))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * A name for the Elastic Beanstalk application.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-applicationname)
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()

    /**
     * Your description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     */
    override fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
  }
}
