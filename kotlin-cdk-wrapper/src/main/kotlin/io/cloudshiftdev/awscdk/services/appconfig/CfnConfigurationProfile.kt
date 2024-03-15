@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnConfigurationProfile internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appconfig.CfnConfigurationProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrConfigurationProfileId(): String =
      unwrap(this).getAttrConfigurationProfileId()

  public open fun attrKmsKeyArn(): String = unwrap(this).getAttrKmsKeyArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  public open fun locationUri(): String = unwrap(this).getLocationUri()

  public open fun locationUri(`value`: String) {
    unwrap(this).setLocationUri(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

  public open fun retrievalRoleArn(`value`: String) {
    unwrap(this).setRetrievalRoleArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun validators(): Any? = unwrap(this).getValidators()

  public open fun validators(`value`: IResolvable) {
    unwrap(this).setValidators(`value`.let(IResolvable::unwrap))
  }

  public open fun validators(__idx_ac66f0: List<Any>) {
    unwrap(this).setValidators(__idx_ac66f0)
  }

  public open fun validators(vararg __idx_ac66f0: Any): Unit = validators(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun description(description: String)

    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    public fun locationUri(locationUri: String)

    public fun name(name: String)

    public fun retrievalRoleArn(retrievalRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun validators(validators: IResolvable)

    public fun validators(validators: List<Any>)

    public fun validators(vararg validators: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.Builder =
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.Builder.create(scope, id)

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    override fun locationUri(locationUri: String) {
      cdkBuilder.locationUri(locationUri)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun retrievalRoleArn(retrievalRoleArn: String) {
      cdkBuilder.retrievalRoleArn(retrievalRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun validators(validators: IResolvable) {
      cdkBuilder.validators(validators.let(IResolvable::unwrap))
    }

    override fun validators(validators: List<Any>) {
      cdkBuilder.validators(validators)
    }

    override fun validators(vararg validators: Any): Unit = validators(validators.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnConfigurationProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile):
        CfnConfigurationProfile = CfnConfigurationProfile(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProfile):
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile = wrapped.cdkObject
  }

  public interface ValidatorsProperty {
    public fun content(): String? = unwrap(this).getContent()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun content(content: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty.Builder
          =
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty,
    ) : CdkObject(cdkObject), ValidatorsProperty {
      override fun content(): String? = unwrap(this).getContent()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidatorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty):
          ValidatorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidatorsProperty):
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty
    }
  }
}