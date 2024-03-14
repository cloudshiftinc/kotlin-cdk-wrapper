package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface DkimRecord {
  public fun name(): String

  public fun `value`(): String

  public interface Builder {
    public fun name(name: String) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimRecord.Builder =
        software.amazon.awscdk.services.ses.DkimRecord.builder()

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimRecord = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.DkimRecord,
  ) : DkimRecord {
    public override fun name(): String = unwrap(this).getName()

    public override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DkimRecord {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimRecord): DkimRecord =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimRecord): software.amazon.awscdk.services.ses.DkimRecord =
        (wrapped as Wrapper).cdkObject
  }
}
