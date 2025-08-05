@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gameliftstreams

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLiftStreams::Application` resource defines an Amazon GameLift Streams application.
 *
 * An application specifies the content that you want to stream, such as a game or other software,
 * and its runtime environment (Microsoft Windows, Ubuntu, or Proton).
 *
 * Before you create an Amazon GameLift Streams application, upload your *uncompressed* game files
 * to an Amazon Simple Storage Service (Amazon S3) bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
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
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.gameliftstreams.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
   * logs.
   */
  public open fun applicationLogOutputUri(): String? = unwrap(this).getApplicationLogOutputUri()

  /**
   * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
   * logs.
   */
  public open fun applicationLogOutputUri(`value`: String) {
    unwrap(this).setApplicationLogOutputUri(`value`)
  }

  /**
   * Locations of log files that your content generates during a stream session.
   */
  public open fun applicationLogPaths(): List<String> = unwrap(this).getApplicationLogPaths() ?:
      emptyList()

  /**
   * Locations of log files that your content generates during a stream session.
   */
  public open fun applicationLogPaths(`value`: List<String>) {
    unwrap(this).setApplicationLogPaths(`value`)
  }

  /**
   * Locations of log files that your content generates during a stream session.
   */
  public open fun applicationLogPaths(vararg `value`: String): Unit =
      applicationLogPaths(`value`.toList())

  /**
   * The location of the content that you want to stream.
   */
  public open fun applicationSourceUri(): String = unwrap(this).getApplicationSourceUri()

  /**
   * The location of the content that you want to stream.
   */
  public open fun applicationSourceUri(`value`: String) {
    unwrap(this).setApplicationSourceUri(`value`)
  }

  /**
   * An [Amazon Resource Name
   * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
   * identifies the application resource across all AWS Regions. For example:.
   *
   * `arn:aws:gameliftstreams:us-west-2:123456789012:application/a-9ZY8X7Wv6` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An ID that uniquely identifies the application resource.
   *
   * For example: `a-9ZY8X7Wv6` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A human-readable label for the application.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A human-readable label for the application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The path and file name of the executable file that launches the content for streaming.
   */
  public open fun executablePath(): String = unwrap(this).getExecutablePath()

  /**
   * The path and file name of the executable file that launches the content for streaming.
   */
  public open fun executablePath(`value`: String) {
    unwrap(this).setExecutablePath(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A set of configuration settings to run the application on a stream group.
   */
  public open fun runtimeEnvironment(): Any = unwrap(this).getRuntimeEnvironment()

  /**
   * A set of configuration settings to run the application on a stream group.
   */
  public open fun runtimeEnvironment(`value`: IResolvable) {
    unwrap(this).setRuntimeEnvironment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of configuration settings to run the application on a stream group.
   */
  public open fun runtimeEnvironment(`value`: RuntimeEnvironmentProperty) {
    unwrap(this).setRuntimeEnvironment(`value`.let(RuntimeEnvironmentProperty.Companion::unwrap))
  }

  /**
   * A set of configuration settings to run the application on a stream group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c8b0a7fe6a4c2b2984e44e8054f83631fb4a4d25eaa2bcc0e205b2d285b1b89a")
  public open fun runtimeEnvironment(`value`: RuntimeEnvironmentProperty.Builder.() -> Unit): Unit =
      runtimeEnvironment(RuntimeEnvironmentProperty(`value`))

  /**
   * A list of labels to assign to the new application resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of labels to assign to the new application resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gameliftstreams.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
     * logs.
     *
     * Required if you specify one or more `ApplicationLogPaths` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogoutputuri)
     * @param applicationLogOutputUri An Amazon S3 URI to a bucket where you would like Amazon
     * GameLift Streams to save application logs. 
     */
    public fun applicationLogOutputUri(applicationLogOutputUri: String)

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
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session. 
     */
    public fun applicationLogPaths(applicationLogPaths: List<String>)

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
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session. 
     */
    public fun applicationLogPaths(vararg applicationLogPaths: String)

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
     * @param applicationSourceUri The location of the content that you want to stream. 
     */
    public fun applicationSourceUri(applicationSourceUri: String)

    /**
     * A human-readable label for the application.
     *
     * You can update this value later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-description)
     * @param description A human-readable label for the application. 
     */
    public fun description(description: String)

    /**
     * The path and file name of the executable file that launches the content for streaming.
     *
     * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-executablepath)
     * @param executablePath The path and file name of the executable file that launches the content
     * for streaming. 
     */
    public fun executablePath(executablePath: String)

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    public fun runtimeEnvironment(runtimeEnvironment: IResolvable)

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    public fun runtimeEnvironment(runtimeEnvironment: RuntimeEnvironmentProperty)

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97d097e0a6b5dd446afd8f12f2297f64a5aed89750015e3693b9b67d3efb9a39")
    public fun runtimeEnvironment(runtimeEnvironment: RuntimeEnvironmentProperty.Builder.() -> Unit)

    /**
     * A list of labels to assign to the new application resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-tags)
     * @param tags A list of labels to assign to the new application resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gameliftstreams.CfnApplication.Builder =
        software.amazon.awscdk.services.gameliftstreams.CfnApplication.Builder.create(scope, id)

    /**
     * An Amazon S3 URI to a bucket where you would like Amazon GameLift Streams to save application
     * logs.
     *
     * Required if you specify one or more `ApplicationLogPaths` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-applicationlogoutputuri)
     * @param applicationLogOutputUri An Amazon S3 URI to a bucket where you would like Amazon
     * GameLift Streams to save application logs. 
     */
    override fun applicationLogOutputUri(applicationLogOutputUri: String) {
      cdkBuilder.applicationLogOutputUri(applicationLogOutputUri)
    }

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
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session. 
     */
    override fun applicationLogPaths(applicationLogPaths: List<String>) {
      cdkBuilder.applicationLogPaths(applicationLogPaths)
    }

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
     * @param applicationLogPaths Locations of log files that your content generates during a stream
     * session. 
     */
    override fun applicationLogPaths(vararg applicationLogPaths: String): Unit =
        applicationLogPaths(applicationLogPaths.toList())

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
     * @param applicationSourceUri The location of the content that you want to stream. 
     */
    override fun applicationSourceUri(applicationSourceUri: String) {
      cdkBuilder.applicationSourceUri(applicationSourceUri)
    }

    /**
     * A human-readable label for the application.
     *
     * You can update this value later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-description)
     * @param description A human-readable label for the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The path and file name of the executable file that launches the content for streaming.
     *
     * Enter a path value that is relative to the location set in `ApplicationSourceUri` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-executablepath)
     * @param executablePath The path and file name of the executable file that launches the content
     * for streaming. 
     */
    override fun executablePath(executablePath: String) {
      cdkBuilder.executablePath(executablePath)
    }

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    override fun runtimeEnvironment(runtimeEnvironment: IResolvable) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    override fun runtimeEnvironment(runtimeEnvironment: RuntimeEnvironmentProperty) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment.let(RuntimeEnvironmentProperty.Companion::unwrap))
    }

    /**
     * A set of configuration settings to run the application on a stream group.
     *
     * This configures the operating system, and can include compatibility layers and other drivers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-runtimeenvironment)
     * @param runtimeEnvironment A set of configuration settings to run the application on a stream
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97d097e0a6b5dd446afd8f12f2297f64a5aed89750015e3693b9b67d3efb9a39")
    override
        fun runtimeEnvironment(runtimeEnvironment: RuntimeEnvironmentProperty.Builder.() -> Unit):
        Unit = runtimeEnvironment(RuntimeEnvironmentProperty(runtimeEnvironment))

    /**
     * A list of labels to assign to the new application resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-application.html#cfn-gameliftstreams-application-tags)
     * @param tags A list of labels to assign to the new application resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.gameliftstreams.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gameliftstreams.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.gameliftstreams.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.gameliftstreams.CfnApplication
  }

  /**
   * Configuration settings that identify the operating system for an application resource.
   *
   * This can also include a compatibility layer and other drivers.
   *
   * A runtime environment can be one of the following:
   *
   * * For Linux applications
   * * Ubuntu 22.04 LTS ( `Type=UBUNTU, Version=22_04_LTS` )
   * * For Windows applications
   * * Microsoft Windows Server 2022 Base ( `Type=WINDOWS, Version=2022` )
   * * Proton 8.0-5 ( `Type=PROTON, Version=20241007` )
   * * Proton 8.0-2c ( `Type=PROTON, Version=20230704` )
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
   * RuntimeEnvironmentProperty runtimeEnvironmentProperty = RuntimeEnvironmentProperty.builder()
   * .type("type")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-application-runtimeenvironment.html)
   */
  public interface RuntimeEnvironmentProperty {
    /**
     * The operating system and other drivers.
     *
     * For Proton, this also includes the Proton compatibility layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-application-runtimeenvironment.html#cfn-gameliftstreams-application-runtimeenvironment-type)
     */
    public fun type(): String

    /**
     * Versioned container environment for the application operating system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-application-runtimeenvironment.html#cfn-gameliftstreams-application-runtimeenvironment-version)
     */
    public fun version(): String

    /**
     * A builder for [RuntimeEnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The operating system and other drivers. 
       * For Proton, this also includes the Proton compatibility layer.
       */
      public fun type(type: String)

      /**
       * @param version Versioned container environment for the application operating system. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty.builder()

      /**
       * @param type The operating system and other drivers. 
       * For Proton, this also includes the Proton compatibility layer.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param version Versioned container environment for the application operating system. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty,
    ) : CdkObject(cdkObject),
        RuntimeEnvironmentProperty {
      /**
       * The operating system and other drivers.
       *
       * For Proton, this also includes the Proton compatibility layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-application-runtimeenvironment.html#cfn-gameliftstreams-application-runtimeenvironment-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Versioned container environment for the application operating system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-application-runtimeenvironment.html#cfn-gameliftstreams-application-runtimeenvironment-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty):
          RuntimeEnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuntimeEnvironmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeEnvironmentProperty):
          software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gameliftstreams.CfnApplication.RuntimeEnvironmentProperty
    }
  }
}
