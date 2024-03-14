package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAppBlock internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun packagingType(): String? = unwrap(this).getPackagingType()

  public open fun packagingType(`value`: String) {
    unwrap(this).setPackagingType(`value`)
  }

  public open fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

  public open fun postSetupScriptDetails(`value`: IResolvable) {
    unwrap(this).setPostSetupScriptDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun postSetupScriptDetails(`value`: ScriptDetailsProperty) {
    unwrap(this).setPostSetupScriptDetails(`value`.let(ScriptDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64a79332a90ee99f1012a568aa5ddfeaf52a7319753cedede01466c36eeff787")
  public open fun postSetupScriptDetails(`value`: ScriptDetailsProperty.Builder.() -> Unit): Unit =
      postSetupScriptDetails(ScriptDetailsProperty(`value`))

  public open fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

  public open fun setupScriptDetails(`value`: IResolvable) {
    unwrap(this).setSetupScriptDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun setupScriptDetails(`value`: ScriptDetailsProperty) {
    unwrap(this).setSetupScriptDetails(`value`.let(ScriptDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4312b6f2e56c4725b8a59b738054eca29c85d2cc138c83e12357a20d6814fa8")
  public open fun setupScriptDetails(`value`: ScriptDetailsProperty.Builder.() -> Unit): Unit =
      setupScriptDetails(ScriptDetailsProperty(`value`))

  public open fun sourceS3Location(): Any = unwrap(this).getSourceS3Location()

  public open fun sourceS3Location(`value`: IResolvable) {
    unwrap(this).setSourceS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSourceS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07d132ccb2c4b41af14ffd0c4e69b4877c7881541f9a69bb10c8d4f5f0607bdc")
  public open fun sourceS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      sourceS3Location(S3LocationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun name(name: String)

    public fun packagingType(packagingType: String)

    public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable)

    public fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0261eb80ac8d55b73ee29b146ce1d646eb5819f177742e5c2f23ed9bbe524184")
    public
        fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit)

    public fun sourceS3Location(sourceS3Location: IResolvable)

    public fun sourceS3Location(sourceS3Location: S3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("060d0dd50b3f7cd7d93df0c357873251449b8988d54269f8c6cce069f5039165")
    public fun sourceS3Location(sourceS3Location: S3LocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun upScriptDetails(setupScriptDetails: IResolvable)

    public fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7acea0a2b75f58dc64d95ddd807c88fa359b8dae5432710bdd03baec04bf7e4")
    public fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlock.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlock.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packagingType(packagingType: String) {
      cdkBuilder.packagingType(packagingType)
    }

    override fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(IResolvable::unwrap))
    }

    override fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(ScriptDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0261eb80ac8d55b73ee29b146ce1d646eb5819f177742e5c2f23ed9bbe524184")
    override
        fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit):
        Unit = postSetupScriptDetails(ScriptDetailsProperty(postSetupScriptDetails))

    override fun sourceS3Location(sourceS3Location: IResolvable) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(IResolvable::unwrap))
    }

    override fun sourceS3Location(sourceS3Location: S3LocationProperty) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("060d0dd50b3f7cd7d93df0c357873251449b8988d54269f8c6cce069f5039165")
    override fun sourceS3Location(sourceS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        sourceS3Location(S3LocationProperty(sourceS3Location))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun upScriptDetails(setupScriptDetails: IResolvable) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(IResolvable::unwrap))
    }

    override fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(ScriptDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7acea0a2b75f58dc64d95ddd807c88fa359b8dae5432710bdd03baec04bf7e4")
    override fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit): Unit
        = upScriptDetails(ScriptDetailsProperty(setupScriptDetails))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlock = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock): CfnAppBlock
        = CfnAppBlock(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlock): software.amazon.awscdk.services.appstream.CfnAppBlock
        = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun s3Bucket(): String

    public fun s3Key(): String? = unwrap(this).getS3Key()

    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty,
    ) : S3LocationProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Key(): String? = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScriptDetailsProperty {
    public fun executableParameters(): String? = unwrap(this).getExecutableParameters()

    public fun executablePath(): String

    public fun scriptS3Location(): Any

    public fun timeoutInSeconds(): Number

    public interface Builder {
      public fun executableParameters(executableParameters: String)

      public fun executablePath(executablePath: String)

      public fun scriptS3Location(scriptS3Location: IResolvable)

      public fun scriptS3Location(scriptS3Location: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb15631ef25ec0ab9e92de22f1b2fbc0f3822a3921383f3efb5193afbdd6f4f0")
      public fun scriptS3Location(scriptS3Location: S3LocationProperty.Builder.() -> Unit)

      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty.builder()

      override fun executableParameters(executableParameters: String) {
        cdkBuilder.executableParameters(executableParameters)
      }

      override fun executablePath(executablePath: String) {
        cdkBuilder.executablePath(executablePath)
      }

      override fun scriptS3Location(scriptS3Location: IResolvable) {
        cdkBuilder.scriptS3Location(scriptS3Location.let(IResolvable::unwrap))
      }

      override fun scriptS3Location(scriptS3Location: S3LocationProperty) {
        cdkBuilder.scriptS3Location(scriptS3Location.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb15631ef25ec0ab9e92de22f1b2fbc0f3822a3921383f3efb5193afbdd6f4f0")
      override fun scriptS3Location(scriptS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          scriptS3Location(S3LocationProperty(scriptS3Location))

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty,
    ) : ScriptDetailsProperty {
      override fun executableParameters(): String? = unwrap(this).getExecutableParameters()

      override fun executablePath(): String = unwrap(this).getExecutablePath()

      override fun scriptS3Location(): Any = unwrap(this).getScriptS3Location()

      override fun timeoutInSeconds(): Number = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty):
          ScriptDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptDetailsProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
