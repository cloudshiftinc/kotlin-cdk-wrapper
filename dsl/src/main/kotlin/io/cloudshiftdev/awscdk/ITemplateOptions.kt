package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ITemplateOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

  public fun metadata(`value`: Map<String, Any>) {
    unwrap(this).setMetadata(`value`)
  }

  public fun templateFormatVersion(): String? = unwrap(this).getTemplateFormatVersion()

  public fun templateFormatVersion(`value`: String) {
    unwrap(this).setTemplateFormatVersion(`value`)
  }

  public fun transforms(): List<String> = unwrap(this).getTransforms() ?: emptyList()

  public fun transforms(`value`: List<String>) {
    unwrap(this).setTransforms(`value`)
  }

  public fun transforms(vararg `value`: String): Unit = transforms(`value`.toList())

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ITemplateOptions,
  ) : ITemplateOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun description(`value`: String) {
      unwrap(this).setDescription(`value`)
    }

    override fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

    override fun metadata(`value`: Map<String, Any>) {
      unwrap(this).setMetadata(`value`)
    }

    override fun templateFormatVersion(): String? = unwrap(this).getTemplateFormatVersion()

    override fun templateFormatVersion(`value`: String) {
      unwrap(this).setTemplateFormatVersion(`value`)
    }

    override fun transforms(): List<String> = unwrap(this).getTransforms() ?: emptyList()

    override fun transforms(`value`: List<String>) {
      unwrap(this).setTransforms(`value`)
    }

    override fun transforms(vararg `value`: String): Unit = transforms(`value`.toList())
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ITemplateOptions): ITemplateOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITemplateOptions): software.amazon.awscdk.ITemplateOptions =
        (wrapped as Wrapper).cdkObject
  }
}
