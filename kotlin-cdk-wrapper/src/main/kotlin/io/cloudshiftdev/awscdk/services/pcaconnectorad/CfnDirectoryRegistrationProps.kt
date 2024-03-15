@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnDirectoryRegistrationProps {
  public fun directoryId(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun directoryId(directoryId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps.builder()

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps,
  ) : CdkObject(cdkObject), CfnDirectoryRegistrationProps {
    override fun directoryId(): String = unwrap(this).getDirectoryId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps):
        CfnDirectoryRegistrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryRegistrationProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistrationProps
  }
}
