package io.cloudshiftdev.awscdk.services.eks

public enum class TaintEffect(
  private val cdkObject: software.amazon.awscdk.services.eks.TaintEffect,
) {
  NO_SCHEDULE(software.amazon.awscdk.services.eks.TaintEffect.NO_SCHEDULE),
  PREFER_NO_SCHEDULE(software.amazon.awscdk.services.eks.TaintEffect.PREFER_NO_SCHEDULE),
  NO_EXECUTE(software.amazon.awscdk.services.eks.TaintEffect.NO_EXECUTE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.TaintEffect): TaintEffect =
        when (cdkObject) {
      software.amazon.awscdk.services.eks.TaintEffect.NO_SCHEDULE -> TaintEffect.NO_SCHEDULE
      software.amazon.awscdk.services.eks.TaintEffect.PREFER_NO_SCHEDULE ->
          TaintEffect.PREFER_NO_SCHEDULE
      software.amazon.awscdk.services.eks.TaintEffect.NO_EXECUTE -> TaintEffect.NO_EXECUTE
    }

    internal fun unwrap(wrapped: TaintEffect): software.amazon.awscdk.services.eks.TaintEffect =
        wrapped.cdkObject
  }
}
