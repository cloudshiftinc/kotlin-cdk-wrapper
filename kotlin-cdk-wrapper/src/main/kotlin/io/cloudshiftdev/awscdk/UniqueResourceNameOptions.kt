@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface UniqueResourceNameOptions {
  public fun allowedSpecialCharacters(): String? = unwrap(this).getAllowedSpecialCharacters()

  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  public fun separator(): String? = unwrap(this).getSeparator()

  @CdkDslMarker
  public interface Builder {
    public fun allowedSpecialCharacters(allowedSpecialCharacters: String)

    public fun maxLength(maxLength: Number)

    public fun separator(separator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.UniqueResourceNameOptions.Builder =
        software.amazon.awscdk.UniqueResourceNameOptions.builder()

    override fun allowedSpecialCharacters(allowedSpecialCharacters: String) {
      cdkBuilder.allowedSpecialCharacters(allowedSpecialCharacters)
    }

    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    override fun separator(separator: String) {
      cdkBuilder.separator(separator)
    }

    public fun build(): software.amazon.awscdk.UniqueResourceNameOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.UniqueResourceNameOptions,
  ) : CdkObject(cdkObject), UniqueResourceNameOptions {
    override fun allowedSpecialCharacters(): String? = unwrap(this).getAllowedSpecialCharacters()

    override fun maxLength(): Number? = unwrap(this).getMaxLength()

    override fun separator(): String? = unwrap(this).getSeparator()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UniqueResourceNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.UniqueResourceNameOptions):
        UniqueResourceNameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UniqueResourceNameOptions):
        software.amazon.awscdk.UniqueResourceNameOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.UniqueResourceNameOptions
  }
}
