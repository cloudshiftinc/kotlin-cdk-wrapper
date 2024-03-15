@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConfigurationProfileProps {
  public fun applicationId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  public fun locationUri(): String

  public fun name(): String

  public fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  public fun validators(): Any? = unwrap(this).getValidators()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.builder()

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

    public fun build(): software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps,
  ) : CdkObject(cdkObject), CfnConfigurationProfileProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    override fun locationUri(): String = unwrap(this).getLocationUri()

    override fun name(): String = unwrap(this).getName()

    override fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()

    override fun validators(): Any? = unwrap(this).getValidators()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps):
        CfnConfigurationProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProfileProps):
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
  }
}
