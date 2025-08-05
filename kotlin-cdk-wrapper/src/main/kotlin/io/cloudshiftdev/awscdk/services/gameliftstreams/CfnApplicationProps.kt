@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gameliftstreams

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationSourceUri("applicationSourceUri")
 * .description("description")
 * .executablePath("executablePath")
 * .runtimeEnvironment(RuntimeEnvironmentProperty.builder()
 * .type("type")
 * .version("version")
 * .build())
 * // the properties below are optional
 * .applicationLogOutputUri("applicationLogOutputUri")
 * .applicationLogPaths(List.of("applicationLogPaths"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html)
 */
public interface CfnApplicationProps {
  /**
   * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
   * logs.
   *
   * Required if you specify one or more `ApplicationLogPaths` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogoutputuri)
   */
  public fun applicationLogOutputUri(): String? = unwrap(this).getApplicationLogOutputUri()

  /**
   * Locations of log files that your content generates during a stream session.
   *
   * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify up
   * to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket that
   * you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored log
   * files, call
   * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
   * and get the `LogFileLocationUri` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogpaths)
   */
  public fun applicationLogPaths(): List<String> = unwrap(this).getApplicationLogPaths() ?:
      emptyList()

  /**
   * The location of the content that you want to stream.
   *
   * Enter an Amazon S3 URI to a bucket that contains your game or other application. The location
   * can have a multi-level prefix structure, but it must include all the files needed to run the
   * content. Amazon GameLift Streams copies everything under the specified location.
   *
   * This value is immutable. To designate a different content location, create a new application.
   *
   *
   * The Amazon S3 bucket and the Amazon GameLift Streams application must be in the same AWS
   * Region.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationsourceuri)
   */
  public fun applicationSourceUri(): String

  /**
   * A human-readable label for the application.
   *
   * You can update this value later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-description)
   */
  public fun description(): String

  /**
   * The path and file name of the executable file that launches the content for streaming.
   *
   * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-executablepath)
   */
  public fun executablePath(): String

  /**
   * A set of configuration settings to run the application on a stream group.
   *
   * This configures the operating system, and can include compatibility layers and other drivers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
   */
  public fun runtimeEnvironment(): Any

  /**
   * A list of labels to assign to the new application resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
   * management, access management and cost allocation. See [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationLogOutputUri An Amazon S3 URI to a bucket where you would like Amazon
     * GameLift Streams to save application logs.
     * Required if you specify one or more `ApplicationLogPaths` .
     */
    public fun applicationLogOutputUri(applicationLogOutputUri: String)

    /**
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session.
     * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify
     * up to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket
     * that you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored
     * log files, call
     * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
     * and get the `LogFileLocationUri` .
     */
    public fun applicationLogPaths(applicationLogPaths: List<String>)

    /**
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session.
     * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify
     * up to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket
     * that you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored
     * log files, call
     * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
     * and get the `LogFileLocationUri` .
     */
    public fun applicationLogPaths(vararg applicationLogPaths: String)

    /**
     * @param applicationSourceUri The location of the content that you want to stream. 
     * Enter an Amazon S3 URI to a bucket that contains your game or other application. The location
     * can have a multi-level prefix structure, but it must include all the files needed to run the
     * content. Amazon GameLift Streams copies everything under the specified location.
     *
     * This value is immutable. To designate a different content location, create a new application.
     *
     *
     * The Amazon S3 bucket and the Amazon GameLift Streams application must be in the same AWS
     * Region.
     */
    public fun applicationSourceUri(applicationSourceUri: String)

    /**
     * @param description A human-readable label for the application. 
     * You can update this value later.
     */
    public fun description(description: String)

    /**
     * @param executablePath The path and file name of the executable file that launches the content
     * for streaming. 
     * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
     */
    public fun executablePath(executablePath: String)

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    public fun runtimeEnvironment(runtimeEnvironment: IResolvable)

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    public fun runtimeEnvironment(runtimeEnvironment: CfnApplication.RuntimeEnvironmentProperty)

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5781874a0aa943e39141a503817bb65efd169da57ad8191f8ee7af9a45604d2")
    public
        fun runtimeEnvironment(runtimeEnvironment: CfnApplication.RuntimeEnvironmentProperty.Builder.() -> Unit)

    /**
     * @param tags A list of labels to assign to the new application resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps.builder()

    /**
     * @param applicationLogOutputUri An Amazon S3 URI to a bucket where you would like Amazon
     * GameLift Streams to save application logs.
     * Required if you specify one or more `ApplicationLogPaths` .
     */
    override fun applicationLogOutputUri(applicationLogOutputUri: String) {
      cdkBuilder.applicationLogOutputUri(applicationLogOutputUri)
    }

    /**
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session.
     * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify
     * up to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket
     * that you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored
     * log files, call
     * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
     * and get the `LogFileLocationUri` .
     */
    override fun applicationLogPaths(applicationLogPaths: List<String>) {
      cdkBuilder.applicationLogPaths(applicationLogPaths)
    }

    /**
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session.
     * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify
     * up to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket
     * that you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored
     * log files, call
     * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
     * and get the `LogFileLocationUri` .
     */
    override fun applicationLogPaths(vararg applicationLogPaths: String): Unit =
        applicationLogPaths(applicationLogPaths.toList())

    /**
     * @param applicationSourceUri The location of the content that you want to stream. 
     * Enter an Amazon S3 URI to a bucket that contains your game or other application. The location
     * can have a multi-level prefix structure, but it must include all the files needed to run the
     * content. Amazon GameLift Streams copies everything under the specified location.
     *
     * This value is immutable. To designate a different content location, create a new application.
     *
     *
     * The Amazon S3 bucket and the Amazon GameLift Streams application must be in the same AWS
     * Region.
     */
    override fun applicationSourceUri(applicationSourceUri: String) {
      cdkBuilder.applicationSourceUri(applicationSourceUri)
    }

    /**
     * @param description A human-readable label for the application. 
     * You can update this value later.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executablePath The path and file name of the executable file that launches the content
     * for streaming. 
     * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
     */
    override fun executablePath(executablePath: String) {
      cdkBuilder.executablePath(executablePath)
    }

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    override fun runtimeEnvironment(runtimeEnvironment: IResolvable) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    override fun runtimeEnvironment(runtimeEnvironment: CfnApplication.RuntimeEnvironmentProperty) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment.let(CfnApplication.RuntimeEnvironmentProperty.Companion::unwrap))
    }

    /**
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     * This configures the operating system, and can include compatibility layers and other drivers.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5781874a0aa943e39141a503817bb65efd169da57ad8191f8ee7af9a45604d2")
    override
        fun runtimeEnvironment(runtimeEnvironment: CfnApplication.RuntimeEnvironmentProperty.Builder.() -> Unit):
        Unit = runtimeEnvironment(CfnApplication.RuntimeEnvironmentProperty(runtimeEnvironment))

    /**
     * @param tags A list of labels to assign to the new application resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
     * logs.
     *
     * Required if you specify one or more `ApplicationLogPaths` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogoutputuri)
     */
    override fun applicationLogOutputUri(): String? = unwrap(this).getApplicationLogOutputUri()

    /**
     * Locations of log files that your content generates during a stream session.
     *
     * Enter path values that are relative to the `ApplicationSourceUri` location. You can specify
     * up to 10 log paths. Amazon GameLift Streams uploads designated log files to the Amazon S3 bucket
     * that you specify in `ApplicationLogOutputUri` at the end of a stream session. To retrieve stored
     * log files, call
     * [GetStreamSession](https://docs.aws.amazon.com/gameliftstreams/latest/apireference/API_GetStreamSession.html)
     * and get the `LogFileLocationUri` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogpaths)
     */
    override fun applicationLogPaths(): List<String> = unwrap(this).getApplicationLogPaths() ?:
        emptyList()

    /**
     * The location of the content that you want to stream.
     *
     * Enter an Amazon S3 URI to a bucket that contains your game or other application. The location
     * can have a multi-level prefix structure, but it must include all the files needed to run the
     * content. Amazon GameLift Streams copies everything under the specified location.
     *
     * This value is immutable. To designate a different content location, create a new application.
     *
     *
     * The Amazon S3 bucket and the Amazon GameLift Streams application must be in the same AWS
     * Region.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationsourceuri)
     */
    override fun applicationSourceUri(): String = unwrap(this).getApplicationSourceUri()

    /**
     * A human-readable label for the application.
     *
     * You can update this value later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The path and file name of the executable file that launches the content for streaming.
     *
     * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-executablepath)
     */
    override fun executablePath(): String = unwrap(this).getExecutablePath()

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     */
    override fun runtimeEnvironment(): Any = unwrap(this).getRuntimeEnvironment()

    /**
     * A list of labels to assign to the new application resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps
  }
}
