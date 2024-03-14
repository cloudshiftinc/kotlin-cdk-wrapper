package io.cloudshiftdev.awscdk.services.transfer

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

public open class CfnWorkflow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrWorkflowId(): String = unwrap(this).getAttrWorkflowId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

  public open fun onExceptionSteps(`value`: IResolvable) {
    unwrap(this).setOnExceptionSteps(`value`.let(IResolvable::unwrap))
  }

  public open fun onExceptionSteps(__idx_ac66f0: List<Any>) {
    unwrap(this).setOnExceptionSteps(__idx_ac66f0)
  }

  public open fun steps(): Any = unwrap(this).getSteps()

  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  public open fun steps(__idx_ac66f0: List<Any>) {
    unwrap(this).setSteps(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun onExceptionSteps(onExceptionSteps: IResolvable) {
    }

    public fun onExceptionSteps(onExceptionSteps: List<Any>) {
    }

    public fun steps(steps: IResolvable) {
    }

    public fun steps(steps: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWorkflow.Builder =
        software.amazon.awscdk.services.transfer.CfnWorkflow.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun onExceptionSteps(onExceptionSteps: IResolvable) {
      cdkBuilder.onExceptionSteps(onExceptionSteps.let(IResolvable::unwrap))
    }

    public override fun onExceptionSteps(onExceptionSteps: List<Any>) {
      cdkBuilder.onExceptionSteps(onExceptionSteps)
    }

    public override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    public override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow): CfnWorkflow
        = CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.transfer.CfnWorkflow
        = wrapped.cdkObject
  }

  public interface InputFileLocationProperty {
    public fun efsFileLocation(): Any? = unwrap(this).getEfsFileLocation()

    public fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()

    public interface Builder {
      public fun efsFileLocation(efsFileLocation: IResolvable) {
      }

      public fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49397a7dcf7bcd8b504d41c0da5636a27f6146c4157ffa3e9c52044a3e8b0799")
      public fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty.Builder.() -> Unit) {
      }

      public fun s3FileLocation(s3FileLocation: IResolvable) {
      }

      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4718862fbc7c4ff9af0f039f9438fbe20f35876c9c4245e4d8ea4a2bb719f")
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty.builder()

      public override fun efsFileLocation(efsFileLocation: IResolvable) {
        cdkBuilder.efsFileLocation(efsFileLocation.let(IResolvable::unwrap))
      }

      public override fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty) {
        cdkBuilder.efsFileLocation(efsFileLocation.let(EfsInputFileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49397a7dcf7bcd8b504d41c0da5636a27f6146c4157ffa3e9c52044a3e8b0799")
      public override
          fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty.Builder.() -> Unit):
          Unit = efsFileLocation(EfsInputFileLocationProperty(efsFileLocation))

      public override fun s3FileLocation(s3FileLocation: IResolvable) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(IResolvable::unwrap))
      }

      public override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(S3InputFileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4718862fbc7c4ff9af0f039f9438fbe20f35876c9c4245e4d8ea4a2bb719f")
      public override
          fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit): Unit =
          s3FileLocation(S3InputFileLocationProperty(s3FileLocation))

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty,
    ) : InputFileLocationProperty {
      public override fun efsFileLocation(): Any? = unwrap(this).getEfsFileLocation()

      public override fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty):
          InputFileLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EfsInputFileLocationProperty {
    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun fileSystemId(fileSystemId: String) {
      }

      public fun path(path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty.Builder
          =
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty.builder()

      public override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty,
    ) : EfsInputFileLocationProperty {
      public override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      public override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EfsInputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty):
          EfsInputFileLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsInputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DecryptStepDetailsProperty {
    public fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

    public fun name(): String? = unwrap(this).getName()

    public fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun destinationFileLocation(destinationFileLocation: IResolvable) {
      }

      public fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d206b1fd4837a7686be621f37592cc66f513ac0d25d20a550e090b4817ddba")
      public
          fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }

      public fun overwriteExisting(overwriteExisting: String) {
      }

      public fun sourceFileLocation(sourceFileLocation: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty.builder()

      public override fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(IResolvable::unwrap))
      }

      public override
          fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(InputFileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d206b1fd4837a7686be621f37592cc66f513ac0d25d20a550e090b4817ddba")
      public override
          fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty.Builder.() -> Unit):
          Unit = destinationFileLocation(InputFileLocationProperty(destinationFileLocation))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
      }

      public override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty,
    ) : DecryptStepDetailsProperty {
      public override fun destinationFileLocation(): Any? =
          unwrap(this).getDestinationFileLocation()

      public override fun name(): String? = unwrap(this).getName()

      public override fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

      public override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DecryptStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty):
          DecryptStepDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecryptStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DeleteStepDetailsProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun sourceFileLocation(sourceFileLocation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty,
    ) : DeleteStepDetailsProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeleteStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty):
          DeleteStepDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeleteStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CopyStepDetailsProperty {
    public fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

    public fun name(): String? = unwrap(this).getName()

    public fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    public interface Builder {
      public fun destinationFileLocation(destinationFileLocation: IResolvable) {
      }

      public fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cd6d54a8f85b9454d405adbac4c046f5d96acab55ffa21a0dd2794316ff0b22")
      public
          fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }

      public fun overwriteExisting(overwriteExisting: String) {
      }

      public fun sourceFileLocation(sourceFileLocation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty.builder()

      public override fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(IResolvable::unwrap))
      }

      public override fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(S3FileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cd6d54a8f85b9454d405adbac4c046f5d96acab55ffa21a0dd2794316ff0b22")
      public override
          fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty.Builder.() -> Unit):
          Unit = destinationFileLocation(S3FileLocationProperty(destinationFileLocation))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
      }

      public override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty,
    ) : CopyStepDetailsProperty {
      public override fun destinationFileLocation(): Any? =
          unwrap(this).getDestinationFileLocation()

      public override fun name(): String? = unwrap(this).getName()

      public override fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

      public override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CopyStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty):
          CopyStepDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomStepDetailsProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    public fun target(): String? = unwrap(this).getTarget()

    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun sourceFileLocation(sourceFileLocation: String) {
      }

      public fun target(target: String) {
      }

      public fun timeoutSeconds(timeoutSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty,
    ) : CustomStepDetailsProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      public override fun target(): String? = unwrap(this).getTarget()

      public override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty):
          CustomStepDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface WorkflowStepProperty {
    public fun copyStepDetails(): Any? = unwrap(this).getCopyStepDetails()

    public fun customStepDetails(): Any? = unwrap(this).getCustomStepDetails()

    public fun decryptStepDetails(): Any? = unwrap(this).getDecryptStepDetails()

    public fun deleteStepDetails(): Any? = unwrap(this).getDeleteStepDetails()

    public fun tagStepDetails(): Any? = unwrap(this).getTagStepDetails()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun copyStepDetails(copyStepDetails: Any) {
      }

      public fun customStepDetails(customStepDetails: Any) {
      }

      public fun decryptStepDetails(decryptStepDetails: IResolvable) {
      }

      public fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1ecb1c1adfefb87617f71a28b53753de53b6cc237ff4207bf5e639516a5e34a")
      public
          fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty.Builder.() -> Unit) {
      }

      public fun deleteStepDetails(deleteStepDetails: Any) {
      }

      public fun tagStepDetails(tagStepDetails: Any) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty.builder()

      public override fun copyStepDetails(copyStepDetails: Any) {
        cdkBuilder.copyStepDetails(copyStepDetails)
      }

      public override fun customStepDetails(customStepDetails: Any) {
        cdkBuilder.customStepDetails(customStepDetails)
      }

      public override fun decryptStepDetails(decryptStepDetails: IResolvable) {
        cdkBuilder.decryptStepDetails(decryptStepDetails.let(IResolvable::unwrap))
      }

      public override fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty) {
        cdkBuilder.decryptStepDetails(decryptStepDetails.let(DecryptStepDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1ecb1c1adfefb87617f71a28b53753de53b6cc237ff4207bf5e639516a5e34a")
      public override
          fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty.Builder.() -> Unit):
          Unit = decryptStepDetails(DecryptStepDetailsProperty(decryptStepDetails))

      public override fun deleteStepDetails(deleteStepDetails: Any) {
        cdkBuilder.deleteStepDetails(deleteStepDetails)
      }

      public override fun tagStepDetails(tagStepDetails: Any) {
        cdkBuilder.tagStepDetails(tagStepDetails)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty,
    ) : WorkflowStepProperty {
      public override fun copyStepDetails(): Any? = unwrap(this).getCopyStepDetails()

      public override fun customStepDetails(): Any? = unwrap(this).getCustomStepDetails()

      public override fun decryptStepDetails(): Any? = unwrap(this).getDecryptStepDetails()

      public override fun deleteStepDetails(): Any? = unwrap(this).getDeleteStepDetails()

      public override fun tagStepDetails(): Any? = unwrap(this).getTagStepDetails()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowStepProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty):
          WorkflowStepProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowStepProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3InputFileLocationProperty {
    public fun bucket(): String? = unwrap(this).getBucket()

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun key(key: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty,
    ) : S3InputFileLocationProperty {
      public override fun bucket(): String? = unwrap(this).getBucket()

      public override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty):
          S3InputFileLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3TagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty,
    ) : S3TagProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3TagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty):
          S3TagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3TagProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TagStepDetailsProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    public fun tags(): List<S3TagProperty> = unwrap(this).getTags()?.map(S3TagProperty::wrap) ?:
        emptyList()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun sourceFileLocation(sourceFileLocation: String) {
      }

      public fun tags(tags: List<S3TagProperty>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public override fun tags(tags: List<S3TagProperty>) {
        cdkBuilder.tags(tags.map(S3TagProperty::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty,
    ) : TagStepDetailsProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      public override fun tags(): List<S3TagProperty> =
          unwrap(this).getTags()?.map(S3TagProperty::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty):
          TagStepDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3FileLocationProperty {
    public fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()

    public interface Builder {
      public fun s3FileLocation(s3FileLocation: IResolvable) {
      }

      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5deeba364254a7436d45af464edae04e28b4856f11f3df8dbc74f70fcaf2cd5d")
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty.builder()

      public override fun s3FileLocation(s3FileLocation: IResolvable) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(IResolvable::unwrap))
      }

      public override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(S3InputFileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5deeba364254a7436d45af464edae04e28b4856f11f3df8dbc74f70fcaf2cd5d")
      public override
          fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit): Unit =
          s3FileLocation(S3InputFileLocationProperty(s3FileLocation))

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty,
    ) : S3FileLocationProperty {
      public override fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3FileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty):
          S3FileLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3FileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
