package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccessPointProps {
  /**
   * The name of this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A configuration used when creating an Object Lambda Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
   */
  public fun objectLambdaConfiguration(): Any

  /**
   * A builder for [CfnAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of this access point.
     */
    public fun name(name: String)

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable)

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty)

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2aee90219fde1a08643e2903d99e4652c1ec66f7e3a1c05615e366d4d7e4a828")
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.builder()

    /**
     * @param name The name of this access point.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    override fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(CfnAccessPoint.ObjectLambdaConfigurationProperty::unwrap))
    }

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     * Point. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2aee90219fde1a08643e2903d99e4652c1ec66f7e3a1c05615e366d4d7e4a828")
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLambdaConfiguration(CfnAccessPoint.ObjectLambdaConfigurationProperty(objectLambdaConfiguration))

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     */
    override fun objectLambdaConfiguration(): Any = unwrap(this).getObjectLambdaConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps
  }
}
