@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SamlProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.SamlProvider,
) : Resource(cdkObject), ISamlProvider {
  public override fun samlProviderArn(): String = unwrap(this).getSamlProviderArn()

  @CdkDslMarker
  public interface Builder {
    public fun metadataDocument(metadataDocument: SamlMetadataDocument)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.SamlProvider.Builder =
        software.amazon.awscdk.services.iam.SamlProvider.Builder.create(scope, id)

    override fun metadataDocument(metadataDocument: SamlMetadataDocument) {
      cdkBuilder.metadataDocument(metadataDocument.let(SamlMetadataDocument::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.iam.SamlProvider = cdkBuilder.build()
  }

  public companion object {
    public fun fromSamlProviderArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      samlProviderArn: String,
    ): ISamlProvider =
        software.amazon.awscdk.services.iam.SamlProvider.fromSamlProviderArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, samlProviderArn).let(ISamlProvider::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SamlProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SamlProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlProvider): SamlProvider =
        SamlProvider(cdkObject)

    internal fun unwrap(wrapped: SamlProvider): software.amazon.awscdk.services.iam.SamlProvider =
        wrapped.cdkObject
  }
}