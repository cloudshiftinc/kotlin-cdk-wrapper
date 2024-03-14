package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRobotApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the robot application.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The current revision id.
   */
  public open fun attrCurrentRevisionId(): String = unwrap(this).getAttrCurrentRevisionId()

  /**
   * The current revision id.
   */
  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The current revision id.
   */
  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  /**
   * The environment of the robot application.
   */
  public open fun environment(): String? = unwrap(this).getEnvironment()

  /**
   * The environment of the robot application.
   */
  public open fun environment(`value`: String) {
    unwrap(this).setEnvironment(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the robot application.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the robot application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The robot software suite used by the robot application.
   */
  public open fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

  /**
   * The robot software suite used by the robot application.
   */
  public open fun robotSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  /**
   * The robot software suite used by the robot application.
   */
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(RobotSoftwareSuiteProperty::unwrap))
  }

  /**
   * The robot software suite used by the robot application.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9629a4b2ece0c3797b9240c742d188b1480cff0907299bd33e095e17687f819d")
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty.Builder.() -> Unit): Unit =
      robotSoftwareSuite(RobotSoftwareSuiteProperty(`value`))

  /**
   * The sources of the robot application.
   */
  public open fun sources(): Any? = unwrap(this).getSources()

  /**
   * The sources of the robot application.
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The sources of the robot application.
   */
  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  /**
   * The sources of the robot application.
   */
  public open fun sources(vararg __idx_ac66f0: Any): Unit = sources(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to the robot application.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A map that contains tag keys and tag values that are attached to the robot application.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.robomaker.CfnRobotApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid)
     * @param currentRevisionId The current revision id. 
     */
    public fun currentRevisionId(currentRevisionId: String)

    /**
     * The environment of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-environment)
     * @param environment The environment of the robot application. 
     */
    public fun environment(environment: String)

    /**
     * The name of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name)
     * @param name The name of the robot application. 
     */
    public fun name(name: String)

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty)

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2583dcdb755019492ee29651e3bdb83602ccc234c931d0a3c30cf9f9d07eb52b")
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit)

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    public fun sources(sources: IResolvable)

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    public fun sources(sources: List<Any>)

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    public fun sources(vararg sources: Any)

    /**
     * A map that contains tag keys and tag values that are attached to the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the robot
     * application. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobotApplication.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplication.Builder.create(scope, id)

    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid)
     * @param currentRevisionId The current revision id. 
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /**
     * The environment of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-environment)
     * @param environment The environment of the robot application. 
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * The name of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name)
     * @param name The name of the robot application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    override fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(RobotSoftwareSuiteProperty::unwrap))
    }

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     * @param robotSoftwareSuite The robot software suite used by the robot application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2583dcdb755019492ee29651e3bdb83602ccc234c931d0a3c30cf9f9d07eb52b")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = robotSoftwareSuite(RobotSoftwareSuiteProperty(robotSoftwareSuite))

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     * @param sources The sources of the robot application. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * A map that contains tag keys and tag values that are attached to the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags)
     * @param tags A map that contains tag keys and tag values that are attached to the robot
     * application. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRobotApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRobotApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplication):
        CfnRobotApplication = CfnRobotApplication(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplication):
        software.amazon.awscdk.services.robomaker.CfnRobotApplication = wrapped.cdkObject
  }

  public interface SourceConfigProperty {
    /**
     * The target processor architecture for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-architecture)
     */
    public fun architecture(): String

    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The s3 object key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-s3key)
     */
    public fun s3Key(): String

    /**
     * A builder for [SourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param architecture The target processor architecture for the application. 
       */
      public fun architecture(architecture: String)

      /**
       * @param s3Bucket The Amazon S3 bucket name. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The s3 object key. 
       */
      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.builder()

      /**
       * @param architecture The target processor architecture for the application. 
       */
      override fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
      }

      /**
       * @param s3Bucket The Amazon S3 bucket name. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The s3 object key. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty,
    ) : SourceConfigProperty {
      /**
       * The target processor architecture for the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-architecture)
       */
      override fun architecture(): String = unwrap(this).getArchitecture()

      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The s3 object key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html#cfn-robomaker-robotapplication-sourceconfig-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty):
          SourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigProperty):
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RobotSoftwareSuiteProperty {
    /**
     * The name of the robot software suite.
     *
     * `General` is the only supported value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html#cfn-robomaker-robotapplication-robotsoftwaresuite-name)
     */
    public fun name(): String

    /**
     * The version of the robot software suite.
     *
     * Not applicable for General software suite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html#cfn-robomaker-robotapplication-robotsoftwaresuite-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [RobotSoftwareSuiteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the robot software suite. 
       * `General` is the only supported value.
       */
      public fun name(name: String)

      /**
       * @param version The version of the robot software suite.
       * Not applicable for General software suite.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.builder()

      /**
       * @param name The name of the robot software suite. 
       * `General` is the only supported value.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the robot software suite.
       * Not applicable for General software suite.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty,
    ) : RobotSoftwareSuiteProperty {
      /**
       * The name of the robot software suite.
       *
       * `General` is the only supported value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html#cfn-robomaker-robotapplication-robotsoftwaresuite-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the robot software suite.
       *
       * Not applicable for General software suite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html#cfn-robomaker-robotapplication-robotsoftwaresuite-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RobotSoftwareSuiteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty):
          RobotSoftwareSuiteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RobotSoftwareSuiteProperty):
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
