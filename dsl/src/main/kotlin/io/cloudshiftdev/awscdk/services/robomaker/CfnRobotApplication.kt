package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCurrentRevisionId(): String = unwrap(this).getAttrCurrentRevisionId()

  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  public open fun environment(): String? = unwrap(this).getEnvironment()

  public open fun environment(`value`: String) {
    unwrap(this).setEnvironment(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun robotSoftwareSuite(): Any = unwrap(this).getRobotSoftwareSuite()

  public open fun robotSoftwareSuite(`value`: IResolvable) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(IResolvable::unwrap))
  }

  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty) {
    unwrap(this).setRobotSoftwareSuite(`value`.let(RobotSoftwareSuiteProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9629a4b2ece0c3797b9240c742d188b1480cff0907299bd33e095e17687f819d")
  public open fun robotSoftwareSuite(`value`: RobotSoftwareSuiteProperty.Builder.() -> Unit): Unit =
      robotSoftwareSuite(RobotSoftwareSuiteProperty(`value`))

  public open fun sources(): Any? = unwrap(this).getSources()

  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun currentRevisionId(currentRevisionId: String)

    public fun environment(environment: String)

    public fun name(name: String)

    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable)

    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2583dcdb755019492ee29651e3bdb83602ccc234c931d0a3c30cf9f9d07eb52b")
    public fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobotApplication.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplication.Builder.create(scope, id)

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(IResolvable::unwrap))
    }

    override fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty) {
      cdkBuilder.robotSoftwareSuite(robotSoftwareSuite.let(RobotSoftwareSuiteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2583dcdb755019492ee29651e3bdb83602ccc234c931d0a3c30cf9f9d07eb52b")
    override
        fun robotSoftwareSuite(robotSoftwareSuite: RobotSoftwareSuiteProperty.Builder.() -> Unit):
        Unit = robotSoftwareSuite(RobotSoftwareSuiteProperty(robotSoftwareSuite))

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

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
    public fun architecture(): String

    public fun s3Bucket(): String

    public fun s3Key(): String

    public interface Builder {
      public fun architecture(architecture: String)

      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.builder()

      override fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

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
      override fun architecture(): String = unwrap(this).getArchitecture()

      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

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
    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder
          =
          software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

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
      override fun name(): String = unwrap(this).getName()

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
