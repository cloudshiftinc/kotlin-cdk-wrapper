package io.cloudshiftdev.awscdk.services.eks

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AwsAuthMapping {
  public fun groups(): List<String>

  public fun username(): String? = unwrap(this).getUsername()

  public interface Builder {
    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuthMapping.Builder =
        software.amazon.awscdk.services.eks.AwsAuthMapping.builder()

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuthMapping = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.AwsAuthMapping,
  ) : AwsAuthMapping {
    override fun groups(): List<String> = unwrap(this).getGroups()

    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AwsAuthMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AwsAuthMapping): AwsAuthMapping
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsAuthMapping): software.amazon.awscdk.services.eks.AwsAuthMapping
        = (wrapped as Wrapper).cdkObject
  }
}
