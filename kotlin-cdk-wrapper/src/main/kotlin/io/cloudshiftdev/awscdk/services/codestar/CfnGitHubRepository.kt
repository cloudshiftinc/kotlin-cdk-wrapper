@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestar

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGitHubRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun code(): Any? = unwrap(this).getCode()

  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable::unwrap))
  }

  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b5aff40e582c6a14e868147d2e5df89c451d3c61991b0239d2ebade8ba4f446")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  public open fun enableIssues(): Any? = unwrap(this).getEnableIssues()

  public open fun enableIssues(`value`: Boolean) {
    unwrap(this).setEnableIssues(`value`)
  }

  public open fun enableIssues(`value`: IResolvable) {
    unwrap(this).setEnableIssues(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isPrivate(): Any? = unwrap(this).getIsPrivate()

  public open fun isPrivate(`value`: Boolean) {
    unwrap(this).setIsPrivate(`value`)
  }

  public open fun isPrivate(`value`: IResolvable) {
    unwrap(this).setIsPrivate(`value`.let(IResolvable::unwrap))
  }

  public open fun repositoryAccessToken(): String? = unwrap(this).getRepositoryAccessToken()

  public open fun repositoryAccessToken(`value`: String) {
    unwrap(this).setRepositoryAccessToken(`value`)
  }

  public open fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  public open fun repositoryDescription(`value`: String) {
    unwrap(this).setRepositoryDescription(`value`)
  }

  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public open fun repositoryOwner(): String = unwrap(this).getRepositoryOwner()

  public open fun repositoryOwner(`value`: String) {
    unwrap(this).setRepositoryOwner(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun code(code: IResolvable)

    public fun code(code: CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0576170719d008fcc3e4deb282cca208bfd690f67322915753fcb0ac80b47f77")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    public fun connectionArn(connectionArn: String)

    public fun enableIssues(enableIssues: Boolean)

    public fun enableIssues(enableIssues: IResolvable)

    public fun isPrivate(isPrivate: Boolean)

    public fun isPrivate(isPrivate: IResolvable)

    public fun repositoryAccessToken(repositoryAccessToken: String)

    public fun repositoryDescription(repositoryDescription: String)

    public fun repositoryName(repositoryName: String)

    public fun repositoryOwner(repositoryOwner: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codestar.CfnGitHubRepository.Builder =
        software.amazon.awscdk.services.codestar.CfnGitHubRepository.Builder.create(scope, id)

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0576170719d008fcc3e4deb282cca208bfd690f67322915753fcb0ac80b47f77")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun enableIssues(enableIssues: Boolean) {
      cdkBuilder.enableIssues(enableIssues)
    }

    override fun enableIssues(enableIssues: IResolvable) {
      cdkBuilder.enableIssues(enableIssues.let(IResolvable::unwrap))
    }

    override fun isPrivate(isPrivate: Boolean) {
      cdkBuilder.isPrivate(isPrivate)
    }

    override fun isPrivate(isPrivate: IResolvable) {
      cdkBuilder.isPrivate(isPrivate.let(IResolvable::unwrap))
    }

    override fun repositoryAccessToken(repositoryAccessToken: String) {
      cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun repositoryOwner(repositoryOwner: String) {
      cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestar.CfnGitHubRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGitHubRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGitHubRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository):
        CfnGitHubRepository = CfnGitHubRepository(cdkObject)

    internal fun unwrap(wrapped: CfnGitHubRepository):
        software.amazon.awscdk.services.codestar.CfnGitHubRepository = wrapped.cdkObject
  }

  public interface CodeProperty {
    public fun s3(): Any

    @CdkDslMarker
    public interface Builder {
      public fun s3(s3: IResolvable)

      public fun s3(s3: S3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fd3a546b010d0c31ae1661af2835497807d2c9e6a6f40850ec667d3d8e1c61e")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.Builder =
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.builder()

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fd3a546b010d0c31ae1661af2835497807d2c9e6a6f40850ec667d3d8e1c61e")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty,
    ) : CdkObject(cdkObject), CodeProperty {
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty):
          CodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty
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
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property.Builder =
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build(): software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property
    }
  }
}
