package io.cloudshiftdev.awscdk.services.codebuild

public enum class ReportGroupType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupType,
) {
  TEST(software.amazon.awscdk.services.codebuild.ReportGroupType.TEST),
  CODE_COVERAGE(software.amazon.awscdk.services.codebuild.ReportGroupType.CODE_COVERAGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupType):
        ReportGroupType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.ReportGroupType.TEST -> ReportGroupType.TEST
      software.amazon.awscdk.services.codebuild.ReportGroupType.CODE_COVERAGE ->
          ReportGroupType.CODE_COVERAGE
    }

    internal fun unwrap(wrapped: ReportGroupType):
        software.amazon.awscdk.services.codebuild.ReportGroupType = wrapped.cdkObject
  }
}
