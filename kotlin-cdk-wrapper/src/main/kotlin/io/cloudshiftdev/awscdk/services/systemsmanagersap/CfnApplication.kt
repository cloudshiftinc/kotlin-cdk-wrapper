@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.systemsmanagersap

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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun applicationType(): String = unwrap(this).getApplicationType()

  public open fun applicationType(`value`: String) {
    unwrap(this).setApplicationType(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun credentials(): Any? = unwrap(this).getCredentials()

  public open fun credentials(`value`: IResolvable) {
    unwrap(this).setCredentials(`value`.let(IResolvable::unwrap))
  }

  public open fun credentials(__idx_ac66f0: List<Any>) {
    unwrap(this).setCredentials(__idx_ac66f0)
  }

  public open fun credentials(vararg __idx_ac66f0: Any): Unit = credentials(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  public open fun instances(`value`: List<String>) {
    unwrap(this).setInstances(`value`)
  }

  public open fun instances(vararg `value`: String): Unit = instances(`value`.toList())

  public open fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

  public open fun sapInstanceNumber(`value`: String) {
    unwrap(this).setSapInstanceNumber(`value`)
  }

  public open fun sid(): String? = unwrap(this).getSid()

  public open fun sid(`value`: String) {
    unwrap(this).setSid(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun applicationType(applicationType: String)

    public fun credentials(credentials: IResolvable)

    public fun credentials(credentials: List<Any>)

    public fun credentials(vararg credentials: Any)

    public fun instances(instances: List<String>)

    public fun instances(vararg instances: String)

    public fun sapInstanceNumber(sapInstanceNumber: String)

    public fun sid(sid: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.Builder
        = software.amazon.awscdk.services.systemsmanagersap.CfnApplication.Builder.create(scope, id)

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun applicationType(applicationType: String) {
      cdkBuilder.applicationType(applicationType)
    }

    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
    }

    override fun credentials(credentials: List<Any>) {
      cdkBuilder.credentials(credentials)
    }

    override fun credentials(vararg credentials: Any): Unit = credentials(credentials.toList())

    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    override fun sapInstanceNumber(sapInstanceNumber: String) {
      cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.systemsmanagersap.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.systemsmanagersap.CfnApplication = wrapped.cdkObject
  }

  public interface CredentialProperty {
    public fun credentialType(): String? = unwrap(this).getCredentialType()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun secretId(): String? = unwrap(this).getSecretId()

    @CdkDslMarker
    public interface Builder {
      public fun credentialType(credentialType: String)

      public fun databaseName(databaseName: String)

      public fun secretId(secretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty.Builder
          =
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty.builder()

      override fun credentialType(credentialType: String) {
        cdkBuilder.credentialType(credentialType)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
      }

      public fun build():
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty,
    ) : CdkObject(cdkObject), CredentialProperty {
      override fun credentialType(): String? = unwrap(this).getCredentialType()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun secretId(): String? = unwrap(this).getSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CredentialProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty):
          CredentialProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CredentialProperty):
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty
    }
  }
}
