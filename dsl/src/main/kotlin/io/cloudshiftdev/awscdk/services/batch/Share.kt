package io.cloudshiftdev.awscdk.services.batch

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface Share {
  public fun shareIdentifier(): String

  public fun weightFactor(): Number

  public interface Builder {
    public fun shareIdentifier(shareIdentifier: String)

    public fun weightFactor(weightFactor: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Share.Builder =
        software.amazon.awscdk.services.batch.Share.builder()

    override fun shareIdentifier(shareIdentifier: String) {
      cdkBuilder.shareIdentifier(shareIdentifier)
    }

    override fun weightFactor(weightFactor: Number) {
      cdkBuilder.weightFactor(weightFactor)
    }

    public fun build(): software.amazon.awscdk.services.batch.Share = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.Share,
  ) : Share {
    override fun shareIdentifier(): String = unwrap(this).getShareIdentifier()

    override fun weightFactor(): Number = unwrap(this).getWeightFactor()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Share {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Share): Share =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Share): software.amazon.awscdk.services.batch.Share = (wrapped as
        Wrapper).cdkObject
  }
}
