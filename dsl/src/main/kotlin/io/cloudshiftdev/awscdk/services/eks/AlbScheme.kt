package io.cloudshiftdev.awscdk.services.eks

public enum class AlbScheme(
  private val cdkObject: software.amazon.awscdk.services.eks.AlbScheme,
) {
  INTERNAL(software.amazon.awscdk.services.eks.AlbScheme.INTERNAL),
  INTERNET_FACING(software.amazon.awscdk.services.eks.AlbScheme.INTERNET_FACING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbScheme): AlbScheme = when
        (cdkObject) {
      software.amazon.awscdk.services.eks.AlbScheme.INTERNAL -> AlbScheme.INTERNAL
      software.amazon.awscdk.services.eks.AlbScheme.INTERNET_FACING -> AlbScheme.INTERNET_FACING
    }

    internal fun unwrap(wrapped: AlbScheme): software.amazon.awscdk.services.eks.AlbScheme =
        wrapped.cdkObject
  }
}
