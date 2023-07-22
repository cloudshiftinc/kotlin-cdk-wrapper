@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps
import software.amazon.awscdk.services.macie.CfnSession
import software.amazon.awscdk.services.macie.CfnSessionProps
import software.constructs.Construct

public object macie {
  /**
   * The `AWS::Macie::AllowList` resource specifies an allow list.
   *
   * In Amazon Macie , an allow list defines specific text or a text pattern for Macie to ignore
   * when it inspects data sources for sensitive data. If data matches text or a text pattern in an
   * allow list, Macie doesn’t report the data in sensitive data findings or sensitive data discovery
   * results, even if the data matches the criteria of a custom data identifier or a managed data
   * identifier. You can create and use allow lists in all the AWS Regions where Macie is currently
   * available except the Asia Pacific (Osaka) Region.
   *
   * Macie supports two types of allow lists:
   *
   * * *Predefined text* - For this type of list ( `S3WordsList` ), you create a line-delimited
   * plaintext file that lists specific text to ignore, and you store the file in an Amazon Simple
   * Storage Service ( Amazon S3 ) bucket. You then configure settings for Macie to access the list in
   * the bucket.
   *
   * This type of list typically contains specific words, phrases, and other kinds of character
   * sequences that aren’t sensitive, aren't likely to change, and don’t necessarily adhere to a common
   * pattern. If you use this type of list, Macie doesn't report occurrences of text that exactly match
   * a complete entry in the list. Macie treats each entry in the list as a string literal value.
   * Matches aren't case sensitive.
   *
   * * *Regular expression* - For this type of list ( `Regex` ), you specify a regular expression
   * that defines a text pattern to ignore. Unlike an allow list with predefined text, you store the
   * regex and all other list settings in Macie .
   *
   * This type of list is helpful if you want to specify text that isn’t sensitive but varies or is
   * likely to change while also adhering to a common pattern. If you use this type of list, Macie
   * doesn't report occurrences of text that completely match the pattern defined by the list.
   *
   * For more information, see [Defining sensitive data exceptions with allow
   * lists](https://docs.aws.amazon.com/macie/latest/user/allow-lists.html) in the *Amazon Macie User
   * Guide* .
   *
   * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
   * `AWS::Macie::AllowList` resource for the account. Use a [DependsOn
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
   * created for an account. For example, `"DependsOn": "Session"` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnAllowList cfnAllowList = CfnAllowList.Builder.create(this, "MyCfnAllowList")
   * .criteria(CriteriaProperty.builder()
   * .regex("regex")
   * .s3WordsList(S3WordsListProperty.builder()
   * .bucketName("bucketName")
   * .objectKey("objectKey")
   * .build())
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html)
   */
  public inline fun cfnAllowList(
    scope: Construct,
    id: String,
    block: CfnAllowListDsl.() -> Unit = {},
  ): CfnAllowList {
    val builder = CfnAllowListDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the criteria for an allow list, which is a list that defines specific text or a text
   * pattern to ignore when inspecting data sources for sensitive data.
   *
   * The criteria can be:
   *
   * * The location and name of an Amazon Simple Storage Service ( Amazon S3 ) object that lists
   * specific, predefined text to ignore ( `S3WordsList` ), or
   * * A regular expression ( `Regex` ) that defines a text pattern to ignore.
   *
   * The criteria must specify either an S3 object or a regular expression. It can't specify both.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CriteriaProperty criteriaProperty = CriteriaProperty.builder()
   * .regex("regex")
   * .s3WordsList(S3WordsListProperty.builder()
   * .bucketName("bucketName")
   * .objectKey("objectKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html)
   */
  public inline fun cfnAllowListCriteriaProperty(block: CfnAllowListCriteriaPropertyDsl.() -> Unit =
      {}): CfnAllowList.CriteriaProperty {
    val builder = CfnAllowListCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAllowList`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnAllowListProps cfnAllowListProps = CfnAllowListProps.builder()
   * .criteria(CriteriaProperty.builder()
   * .regex("regex")
   * .s3WordsList(S3WordsListProperty.builder()
   * .bucketName("bucketName")
   * .objectKey("objectKey")
   * .build())
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html)
   */
  public inline fun cfnAllowListProps(block: CfnAllowListPropsDsl.() -> Unit = {}):
      CfnAllowListProps {
    val builder = CfnAllowListPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the location and name of an Amazon Simple Storage Service ( Amazon S3 ) object that
   * lists specific, predefined text to ignore when inspecting data sources for sensitive data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * S3WordsListProperty s3WordsListProperty = S3WordsListProperty.builder()
   * .bucketName("bucketName")
   * .objectKey("objectKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-s3wordslist.html)
   */
  public inline
      fun cfnAllowListS3WordsListProperty(block: CfnAllowListS3WordsListPropertyDsl.() -> Unit =
      {}): CfnAllowList.S3WordsListProperty {
    val builder = CfnAllowListS3WordsListPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Macie::CustomDataIdentifier` resource specifies a custom data identifier.
   *
   * A *custom data identifier* is a set of custom criteria for Amazon Macie to use when it inspects
   * data sources for sensitive data. The criteria consist of a regular expression ( *regex* ) that
   * defines a text pattern to match and, optionally, character sequences and a proximity rule that
   * refine the results. The character sequences can be:
   *
   * * *Keywords* , which are words or phrases that must be in proximity of text that matches the
   * regex, or
   * * *Ignore words* , which are words or phrases to exclude from the results.
   *
   * By using custom data identifiers, you can supplement the managed data identifiers that Macie
   * provides and detect sensitive data that reflects your particular scenarios, intellectual property,
   * or proprietary data. For more information, see [Building custom data
   * identifiers](https://docs.aws.amazon.com/macie/latest/user/custom-data-identifiers.html) in the
   * *Amazon Macie User Guide* .
   *
   * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
   * `AWS::Macie::CustomDataIdentifier` resource for the account. Use a [DependsOn
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
   * created for an account. For example, `"DependsOn": "Session"` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnCustomDataIdentifier cfnCustomDataIdentifier = CfnCustomDataIdentifier.Builder.create(this,
   * "MyCfnCustomDataIdentifier")
   * .name("name")
   * .regex("regex")
   * // the properties below are optional
   * .description("description")
   * .ignoreWords(List.of("ignoreWords"))
   * .keywords(List.of("keywords"))
   * .maximumMatchDistance(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html)
   */
  public inline fun cfnCustomDataIdentifier(
    scope: Construct,
    id: String,
    block: CfnCustomDataIdentifierDsl.() -> Unit = {},
  ): CfnCustomDataIdentifier {
    val builder = CfnCustomDataIdentifierDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCustomDataIdentifier`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnCustomDataIdentifierProps cfnCustomDataIdentifierProps =
   * CfnCustomDataIdentifierProps.builder()
   * .name("name")
   * .regex("regex")
   * // the properties below are optional
   * .description("description")
   * .ignoreWords(List.of("ignoreWords"))
   * .keywords(List.of("keywords"))
   * .maximumMatchDistance(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html)
   */
  public inline fun cfnCustomDataIdentifierProps(block: CfnCustomDataIdentifierPropsDsl.() -> Unit =
      {}): CfnCustomDataIdentifierProps {
    val builder = CfnCustomDataIdentifierPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Macie::FindingsFilter` resource specifies a findings filter.
   *
   * In Amazon Macie , a *findings filter* , also referred to as a *filter rule* , is a set of
   * custom criteria that specifies which findings to include or exclude from the results of a query
   * for findings. The criteria can help you identify and focus on findings that have specific
   * characteristics, such as severity, type, or the name of an affected AWS resource. You can also
   * configure a findings filter to suppress (automatically archive) findings that match the filter's
   * criteria. For more information, see [Filtering
   * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
   * *Amazon Macie User Guide* .
   *
   * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
   * `AWS::Macie::FindingsFilter` resource for the account. Use a [DependsOn
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
   * created for an account. For example, `"DependsOn": "Session"` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnFindingsFilter cfnFindingsFilter = CfnFindingsFilter.Builder.create(this,
   * "MyCfnFindingsFilter")
   * .findingCriteria(FindingCriteriaProperty.builder()
   * .criterion(Map.of(
   * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build()))
   * .build())
   * .name("name")
   * // the properties below are optional
   * .action("action")
   * .description("description")
   * .position(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html)
   */
  public inline fun cfnFindingsFilter(
    scope: Construct,
    id: String,
    block: CfnFindingsFilterDsl.() -> Unit = {},
  ): CfnFindingsFilter {
    val builder = CfnFindingsFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a condition that defines the property, operator, and one or more values to use in a
   * findings filter.
   *
   * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
   * specifies which findings to include or exclude from the results of a query for findings. You can
   * also configure a findings filter to suppress (automatically archive) findings that match the
   * filter's criteria. For more information, see [Filtering
   * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
   * *Amazon Macie User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CriterionAdditionalPropertiesProperty criterionAdditionalPropertiesProperty =
   * CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterionadditionalproperties.html)
   */
  public inline
      fun cfnFindingsFilterCriterionAdditionalPropertiesProperty(block: CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl.() -> Unit
      = {}): CfnFindingsFilter.CriterionAdditionalPropertiesProperty {
    val builder = CfnFindingsFilterCriterionAdditionalPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies, as a map, one or more property-based conditions for a findings filter.
   *
   * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
   * specifies which findings to include or exclude from the results of a query for findings. You can
   * also configure a findings filter to suppress (automatically archive) findings that match the
   * filter's criteria. For more information, see [Filtering
   * findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html) in the
   * *Amazon Macie User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * FindingCriteriaProperty findingCriteriaProperty = FindingCriteriaProperty.builder()
   * .criterion(Map.of(
   * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html)
   */
  public inline
      fun cfnFindingsFilterFindingCriteriaProperty(block: CfnFindingsFilterFindingCriteriaPropertyDsl.() -> Unit
      = {}): CfnFindingsFilter.FindingCriteriaProperty {
    val builder = CfnFindingsFilterFindingCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * FindingsFilterListItemProperty findingsFilterListItemProperty =
   * FindingsFilterListItemProperty.builder()
   * .id("id")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html)
   */
  public inline
      fun cfnFindingsFilterFindingsFilterListItemProperty(block: CfnFindingsFilterFindingsFilterListItemPropertyDsl.() -> Unit
      = {}): CfnFindingsFilter.FindingsFilterListItemProperty {
    val builder = CfnFindingsFilterFindingsFilterListItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnFindingsFilter`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnFindingsFilterProps cfnFindingsFilterProps = CfnFindingsFilterProps.builder()
   * .findingCriteria(FindingCriteriaProperty.builder()
   * .criterion(Map.of(
   * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
   * .eq(List.of("eq"))
   * .gt(123)
   * .gte(123)
   * .lt(123)
   * .lte(123)
   * .neq(List.of("neq"))
   * .build()))
   * .build())
   * .name("name")
   * // the properties below are optional
   * .action("action")
   * .description("description")
   * .position(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html)
   */
  public inline fun cfnFindingsFilterProps(block: CfnFindingsFilterPropsDsl.() -> Unit = {}):
      CfnFindingsFilterProps {
    val builder = CfnFindingsFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Macie::Session` resource represents the Amazon Macie service and certain
   * configuration settings for an Amazon Macie account in a specific AWS Region .
   *
   * It enables Macie to become operational for a specific account in a specific Region. An account
   * can have only one session in each Region.
   *
   * You must create an `AWS::Macie::Session` resource for an account before you can create other
   * types of resources for the account. Use a [DependsOn
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
   * created for an account. For example, `"DependsOn": "Session"` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnSession cfnSession = CfnSession.Builder.create(this, "MyCfnSession")
   * .findingPublishingFrequency("findingPublishingFrequency")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html)
   */
  public inline fun cfnSession(
    scope: Construct,
    id: String,
    block: CfnSessionDsl.() -> Unit = {},
  ): CfnSession {
    val builder = CfnSessionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSession`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.macie.*;
   * CfnSessionProps cfnSessionProps = CfnSessionProps.builder()
   * .findingPublishingFrequency("findingPublishingFrequency")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html)
   */
  public inline fun cfnSessionProps(block: CfnSessionPropsDsl.() -> Unit = {}): CfnSessionProps {
    val builder = CfnSessionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
