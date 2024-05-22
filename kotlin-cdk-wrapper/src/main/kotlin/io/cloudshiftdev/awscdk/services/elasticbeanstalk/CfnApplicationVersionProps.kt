@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplicationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
 * CfnApplicationVersionProps cfnApplicationVersionProps = CfnApplicationVersionProps.builder()
 * .applicationName("applicationName")
 * .sourceBundle(SourceBundleProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html)
 */
public interface CfnApplicationVersionProps {
  /**
   * The name of the Elastic Beanstalk application that is associated with this application version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-applicationname)
   */
  public fun applicationName(): String

  /**
   * A description of this application version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
   *
   *
   * The Amazon S3 bucket must be in the same region as the environment.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
   */
  public fun sourceBundle(): Any

  /**
   * A builder for [CfnApplicationVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the Elastic Beanstalk application that is associated with
     * this application version. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param description A description of this application version.
     */
    public fun description(description: String)

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    public fun sourceBundle(sourceBundle: IResolvable)

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty)

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df635ebf23329c6182636200cb1c2635bd1d9642bff7f0b6805bf134ef95d6b8")
    public
        fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.builder()

    /**
     * @param applicationName The name of the Elastic Beanstalk application that is associated with
     * this application version. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param description A description of this application version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    override fun sourceBundle(sourceBundle: IResolvable) {
      cdkBuilder.sourceBundle(sourceBundle.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    override fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
      cdkBuilder.sourceBundle(sourceBundle.let(CfnApplicationVersion.SourceBundleProperty.Companion::unwrap))
    }

    /**
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. 
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df635ebf23329c6182636200cb1c2635bd1d9642bff7f0b6805bf134ef95d6b8")
    override
        fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit):
        Unit = sourceBundle(CfnApplicationVersion.SourceBundleProperty(sourceBundle))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps,
  ) : CdkObject(cdkObject), CfnApplicationVersionProps {
    /**
     * The name of the Elastic Beanstalk application that is associated with this application
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * A description of this application version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon S3 bucket and key that identify the location of the source bundle for this
     * version.
     *
     *
     * The Amazon S3 bucket must be in the same region as the environment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-applicationversion.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
     */
    override fun sourceBundle(): Any = unwrap(this).getSourceBundle()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps):
        CfnApplicationVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnApplicationVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationVersionProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
  }
}
