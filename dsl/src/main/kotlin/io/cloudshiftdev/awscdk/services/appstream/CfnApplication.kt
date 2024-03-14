package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appBlockArn(): String = unwrap(this).getAppBlockArn()

  public open fun appBlockArn(`value`: String) {
    unwrap(this).setAppBlockArn(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  public open fun attributesToDelete(`value`: List<String>) {
    unwrap(this).setAttributesToDelete(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun iconS3Location(): Any = unwrap(this).getIconS3Location()

  public open fun iconS3Location(`value`: IResolvable) {
    unwrap(this).setIconS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun iconS3Location(`value`: S3LocationProperty) {
    unwrap(this).setIconS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66f0fd809bf210dd34bc4bf6af499cd69bb6aea3db4ceef275b43565aebbcf1b")
  public open fun iconS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      iconS3Location(S3LocationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceFamilies(): List<String> = unwrap(this).getInstanceFamilies() ?:
      emptyList()

  public open fun instanceFamilies(`value`: List<String>) {
    unwrap(this).setInstanceFamilies(`value`)
  }

  public open fun launchParameters(): String? = unwrap(this).getLaunchParameters()

  public open fun launchParameters(`value`: String) {
    unwrap(this).setLaunchParameters(`value`)
  }

  public open fun launchPath(): String = unwrap(this).getLaunchPath()

  public open fun launchPath(`value`: String) {
    unwrap(this).setLaunchPath(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun platforms(): List<String> = unwrap(this).getPlatforms() ?: emptyList()

  public open fun platforms(`value`: List<String>) {
    unwrap(this).setPlatforms(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  public interface Builder {
    public fun appBlockArn(appBlockArn: String) {
    }

    public fun attributesToDelete(attributesToDelete: List<String>) {
    }

    public fun description(description: String) {
    }

    public fun displayName(displayName: String) {
    }

    public fun iconS3Location(iconS3Location: IResolvable) {
    }

    public fun iconS3Location(iconS3Location: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46379a305c52b05d35309e241b62804bb95cefc712794ec6cb674c528ace3ce1")
    public fun iconS3Location(iconS3Location: S3LocationProperty.Builder.() -> Unit) {
    }

    public fun instanceFamilies(instanceFamilies: List<String>) {
    }

    public fun launchParameters(launchParameters: String) {
    }

    public fun launchPath(launchPath: String) {
    }

    public fun name(name: String) {
    }

    public fun platforms(platforms: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnApplication.Builder =
        software.amazon.awscdk.services.appstream.CfnApplication.Builder.create(scope, id)

    public override fun appBlockArn(appBlockArn: String) {
      cdkBuilder.appBlockArn(appBlockArn)
    }

    public override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun iconS3Location(iconS3Location: IResolvable) {
      cdkBuilder.iconS3Location(iconS3Location.let(IResolvable::unwrap))
    }

    public override fun iconS3Location(iconS3Location: S3LocationProperty) {
      cdkBuilder.iconS3Location(iconS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46379a305c52b05d35309e241b62804bb95cefc712794ec6cb674c528ace3ce1")
    public override fun iconS3Location(iconS3Location: S3LocationProperty.Builder.() -> Unit): Unit
        = iconS3Location(S3LocationProperty(iconS3Location))

    public override fun instanceFamilies(instanceFamilies: List<String>) {
      cdkBuilder.instanceFamilies(instanceFamilies)
    }

    public override fun launchParameters(launchParameters: String) {
      cdkBuilder.launchParameters(launchParameters)
    }

    public override fun launchPath(launchPath: String) {
      cdkBuilder.launchPath(launchPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun platforms(platforms: List<String>) {
      cdkBuilder.platforms(platforms)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.appstream.CfnApplication = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun s3Bucket(): String

    public fun s3Key(): String

    public interface Builder {
      public fun s3Bucket(s3Bucket: String) {
      }

      public fun s3Key(s3Key: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty.builder()

      public override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      public override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      public override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
