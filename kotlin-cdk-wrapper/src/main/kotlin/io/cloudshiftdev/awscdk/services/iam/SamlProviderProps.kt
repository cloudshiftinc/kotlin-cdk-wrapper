@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SamlProviderProps {
  public fun metadataDocument(): SamlMetadataDocument

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun metadataDocument(metadataDocument: SamlMetadataDocument)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.SamlProviderProps.Builder =
        software.amazon.awscdk.services.iam.SamlProviderProps.builder()

    override fun metadataDocument(metadataDocument: SamlMetadataDocument) {
      cdkBuilder.metadataDocument(metadataDocument.let(SamlMetadataDocument::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.iam.SamlProviderProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.SamlProviderProps,
  ) : CdkObject(cdkObject), SamlProviderProps {
    override fun metadataDocument(): SamlMetadataDocument =
        unwrap(this).getMetadataDocument().let(SamlMetadataDocument::wrap)

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SamlProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.SamlProviderProps):
        SamlProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SamlProviderProps):
        software.amazon.awscdk.services.iam.SamlProviderProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.SamlProviderProps
  }
}
