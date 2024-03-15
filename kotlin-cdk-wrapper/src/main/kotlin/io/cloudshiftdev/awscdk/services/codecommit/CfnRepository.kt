@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCloneUrlHttp(): String = unwrap(this).getAttrCloneUrlHttp()

  public open fun attrCloneUrlSsh(): String = unwrap(this).getAttrCloneUrlSsh()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun code(): Any? = unwrap(this).getCode()

  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable::unwrap))
  }

  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67a3e3849f110839ab6fc49fb4e7c6d9bf667ceee3cf4cf771287b9af26a4b8b")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  public open fun repositoryDescription(`value`: String) {
    unwrap(this).setRepositoryDescription(`value`)
  }

  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun triggers(): Any? = unwrap(this).getTriggers()

  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  public open fun triggers(__idx_ac66f0: List<Any>) {
    unwrap(this).setTriggers(__idx_ac66f0)
  }

  public open fun triggers(vararg __idx_ac66f0: Any): Unit = triggers(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun code(code: IResolvable)

    public fun code(code: CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9fd4d268d04ae519367c5e33ce2b6df25d1e474a34053bdfc54974fc3b3d3dc1")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun repositoryDescription(repositoryDescription: String)

    public fun repositoryName(repositoryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CfnRepository.Builder =
        software.amazon.awscdk.services.codecommit.CfnRepository.Builder.create(scope, id)

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9fd4d268d04ae519367c5e33ce2b6df25d1e474a34053bdfc54974fc3b3d3dc1")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codecommit.CfnRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository):
        CfnRepository = CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository):
        software.amazon.awscdk.services.codecommit.CfnRepository = wrapped.cdkObject
  }

  public interface CodeProperty {
    public fun branchName(): String? = unwrap(this).getBranchName()

    public fun s3(): Any

    @CdkDslMarker
    public interface Builder {
      public fun branchName(branchName: String)

      public fun s3(s3: IResolvable)

      public fun s3(s3: S3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c913cac2906efe85d52961192d80b494f8add6529f9c3d9d5834e0d5692edef1")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.Builder =
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.builder()

      override fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
      }

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c913cac2906efe85d52961192d80b494f8add6529f9c3d9d5834e0d5692edef1")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty,
    ) : CdkObject(cdkObject), CodeProperty {
      override fun branchName(): String? = unwrap(this).getBranchName()

      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty
    }
  }

  public interface S3Property {
    public fun bucket(): String

    public fun key(): String

    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)

      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property.Builder =
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build(): software.amazon.awscdk.services.codecommit.CfnRepository.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()

      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.S3Property
    }
  }

  public interface RepositoryTriggerProperty {
    public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    public fun customData(): String? = unwrap(this).getCustomData()

    public fun destinationArn(): String

    public fun events(): List<String>

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun branches(branches: List<String>)

      public fun branches(vararg branches: String)

      public fun customData(customData: String)

      public fun destinationArn(destinationArn: String)

      public fun events(events: List<String>)

      public fun events(vararg events: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder
          =
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.builder()

      override fun branches(branches: List<String>) {
        cdkBuilder.branches(branches)
      }

      override fun branches(vararg branches: String): Unit = branches(branches.toList())

      override fun customData(customData: String) {
        cdkBuilder.customData(customData)
      }

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      override fun events(vararg events: String): Unit = events(events.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty,
    ) : CdkObject(cdkObject), RepositoryTriggerProperty {
      override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

      override fun customData(): String? = unwrap(this).getCustomData()

      override fun destinationArn(): String = unwrap(this).getDestinationArn()

      override fun events(): List<String> = unwrap(this).getEvents()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty):
          RepositoryTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryTriggerProperty):
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty
    }
  }
}
