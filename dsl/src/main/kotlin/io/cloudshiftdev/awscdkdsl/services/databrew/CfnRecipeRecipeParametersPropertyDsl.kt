@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Parameters that are used as inputs for various recipe actions.
 *
 * The parameters are specific to the context in which they're used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * Object input;
 * RecipeParametersProperty recipeParametersProperty = RecipeParametersProperty.builder()
 * .aggregateFunction("aggregateFunction")
 * .base("base")
 * .caseStatement("caseStatement")
 * .categoryMap("categoryMap")
 * .charsToRemove("charsToRemove")
 * .collapseConsecutiveWhitespace("collapseConsecutiveWhitespace")
 * .columnDataType("columnDataType")
 * .columnRange("columnRange")
 * .count("count")
 * .customCharacters("customCharacters")
 * .customStopWords("customStopWords")
 * .customValue("customValue")
 * .datasetsColumns("datasetsColumns")
 * .dateAddValue("dateAddValue")
 * .dateTimeFormat("dateTimeFormat")
 * .dateTimeParameters("dateTimeParameters")
 * .deleteOtherRows("deleteOtherRows")
 * .delimiter("delimiter")
 * .endPattern("endPattern")
 * .endPosition("endPosition")
 * .endValue("endValue")
 * .expandContractions("expandContractions")
 * .exponent("exponent")
 * .falseString("falseString")
 * .groupByAggFunctionOptions("groupByAggFunctionOptions")
 * .groupByColumns("groupByColumns")
 * .hiddenColumns("hiddenColumns")
 * .ignoreCase("ignoreCase")
 * .includeInSplit("includeInSplit")
 * .input(input)
 * .interval("interval")
 * .isText("isText")
 * .joinKeys("joinKeys")
 * .joinType("joinType")
 * .leftColumns("leftColumns")
 * .limit("limit")
 * .lowerBound("lowerBound")
 * .mapType("mapType")
 * .modeType("modeType")
 * .multiLine(false)
 * .numRows("numRows")
 * .numRowsAfter("numRowsAfter")
 * .numRowsBefore("numRowsBefore")
 * .orderByColumn("orderByColumn")
 * .orderByColumns("orderByColumns")
 * .other("other")
 * .pattern("pattern")
 * .patternOption1("patternOption1")
 * .patternOption2("patternOption2")
 * .patternOptions("patternOptions")
 * .period("period")
 * .position("position")
 * .removeAllPunctuation("removeAllPunctuation")
 * .removeAllQuotes("removeAllQuotes")
 * .removeAllWhitespace("removeAllWhitespace")
 * .removeCustomCharacters("removeCustomCharacters")
 * .removeCustomValue("removeCustomValue")
 * .removeLeadingAndTrailingPunctuation("removeLeadingAndTrailingPunctuation")
 * .removeLeadingAndTrailingQuotes("removeLeadingAndTrailingQuotes")
 * .removeLeadingAndTrailingWhitespace("removeLeadingAndTrailingWhitespace")
 * .removeLetters("removeLetters")
 * .removeNumbers("removeNumbers")
 * .removeSourceColumn("removeSourceColumn")
 * .removeSpecialCharacters("removeSpecialCharacters")
 * .rightColumns("rightColumns")
 * .sampleSize("sampleSize")
 * .sampleType("sampleType")
 * .secondaryInputs(List.of(SecondaryInputProperty.builder()
 * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .s3InputDefinition(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build()))
 * .secondInput("secondInput")
 * .sheetIndexes(List.of(123))
 * .sheetNames(List.of("sheetNames"))
 * .sourceColumn("sourceColumn")
 * .sourceColumn1("sourceColumn1")
 * .sourceColumn2("sourceColumn2")
 * .sourceColumns("sourceColumns")
 * .startColumnIndex("startColumnIndex")
 * .startPattern("startPattern")
 * .startPosition("startPosition")
 * .startValue("startValue")
 * .stemmingMode("stemmingMode")
 * .stepCount("stepCount")
 * .stepIndex("stepIndex")
 * .stopWordsMode("stopWordsMode")
 * .strategy("strategy")
 * .targetColumn("targetColumn")
 * .targetColumnNames("targetColumnNames")
 * .targetDateFormat("targetDateFormat")
 * .targetIndex("targetIndex")
 * .timeZone("timeZone")
 * .tokenizerPattern("tokenizerPattern")
 * .trueString("trueString")
 * .udfLang("udfLang")
 * .units("units")
 * .unpivotColumn("unpivotColumn")
 * .upperBound("upperBound")
 * .useNewDataFrame("useNewDataFrame")
 * .value("value")
 * .value1("value1")
 * .value2("value2")
 * .valueColumn("valueColumn")
 * .viewFrame("viewFrame")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html)
 */
@CdkDslMarker
public class CfnRecipeRecipeParametersPropertyDsl {
    private val cdkBuilder: CfnRecipe.RecipeParametersProperty.Builder =
        CfnRecipe.RecipeParametersProperty.builder()

    private val _secondaryInputs: MutableList<Any> = mutableListOf()

    private val _sheetIndexes: MutableList<Number> = mutableListOf()

    private val _sheetNames: MutableList<String> = mutableListOf()

    /** @param aggregateFunction The name of an aggregation function to apply. */
    public fun aggregateFunction(aggregateFunction: String) {
        cdkBuilder.aggregateFunction(aggregateFunction)
    }

    /** @param base The number of digits used in a counting system. */
    public fun base(base: String) {
        cdkBuilder.base(base)
    }

    /** @param caseStatement A case statement associated with a recipe. */
    public fun caseStatement(caseStatement: String) {
        cdkBuilder.caseStatement(caseStatement)
    }

    /** @param categoryMap A category map used for one-hot encoding. */
    public fun categoryMap(categoryMap: String) {
        cdkBuilder.categoryMap(categoryMap)
    }

    /**
     * @param charsToRemove Characters to remove from a step that applies one-hot encoding or
     *   tokenization.
     */
    public fun charsToRemove(charsToRemove: String) {
        cdkBuilder.charsToRemove(charsToRemove)
    }

    /** @param collapseConsecutiveWhitespace Remove any non-word non-punctuation character. */
    public fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String) {
        cdkBuilder.collapseConsecutiveWhitespace(collapseConsecutiveWhitespace)
    }

    /** @param columnDataType The data type of the column. */
    public fun columnDataType(columnDataType: String) {
        cdkBuilder.columnDataType(columnDataType)
    }

    /** @param columnRange A range of columns to which a step is applied. */
    public fun columnRange(columnRange: String) {
        cdkBuilder.columnRange(columnRange)
    }

    /** @param count The number of times a string needs to be repeated. */
    public fun count(count: String) {
        cdkBuilder.count(count)
    }

    /**
     * @param customCharacters One or more characters that can be substituted or removed, depending
     *   on the context.
     */
    public fun customCharacters(customCharacters: String) {
        cdkBuilder.customCharacters(customCharacters)
    }

    /**
     * @param customStopWords A list of words to ignore in a step that applies word tokenization.
     */
    public fun customStopWords(customStopWords: String) {
        cdkBuilder.customStopWords(customStopWords)
    }

    /**
     * @param customValue A list of custom values to use in a step that requires that you provide a
     *   value to finish the operation.
     */
    public fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
    }

    /** @param datasetsColumns A list of the dataset columns included in a project. */
    public fun datasetsColumns(datasetsColumns: String) {
        cdkBuilder.datasetsColumns(datasetsColumns)
    }

    /**
     * @param dateAddValue A value that specifies how many units of time to add or subtract for a
     *   date math operation.
     */
    public fun dateAddValue(dateAddValue: String) {
        cdkBuilder.dateAddValue(dateAddValue)
    }

    /** @param dateTimeFormat A date format to apply to a date. */
    public fun dateTimeFormat(dateTimeFormat: String) {
        cdkBuilder.dateTimeFormat(dateTimeFormat)
    }

    /** @param dateTimeParameters A set of parameters associated with a datetime. */
    public fun dateTimeParameters(dateTimeParameters: String) {
        cdkBuilder.dateTimeParameters(dateTimeParameters)
    }

    /**
     * @param deleteOtherRows Determines whether unmapped rows in a categorical mapping should be
     *   deleted.
     */
    public fun deleteOtherRows(deleteOtherRows: String) {
        cdkBuilder.deleteOtherRows(deleteOtherRows)
    }

    /** @param delimiter The delimiter to use when parsing separated values in a text file. */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /** @param endPattern The end pattern to locate. */
    public fun endPattern(endPattern: String) {
        cdkBuilder.endPattern(endPattern)
    }

    /** @param endPosition The end position to locate. */
    public fun endPosition(endPosition: String) {
        cdkBuilder.endPosition(endPosition)
    }

    /** @param endValue The end value to locate. */
    public fun endValue(endValue: String) {
        cdkBuilder.endValue(endValue)
    }

    /**
     * @param expandContractions A list of word contractions and what they expand to. For eample:
     *   *can't* ; *cannot* ; *can not* .
     */
    public fun expandContractions(expandContractions: String) {
        cdkBuilder.expandContractions(expandContractions)
    }

    /** @param exponent The exponent to apply in an exponential operation. */
    public fun exponent(exponent: String) {
        cdkBuilder.exponent(exponent)
    }

    /** @param falseString A value that represents `FALSE` . */
    public fun falseString(falseString: String) {
        cdkBuilder.falseString(falseString)
    }

    /**
     * @param groupByAggFunctionOptions Specifies options to apply to the `GROUP BY` used in an
     *   aggregation.
     */
    public fun groupByAggFunctionOptions(groupByAggFunctionOptions: String) {
        cdkBuilder.groupByAggFunctionOptions(groupByAggFunctionOptions)
    }

    /** @param groupByColumns The columns to use in the `GROUP BY` clause. */
    public fun groupByColumns(groupByColumns: String) {
        cdkBuilder.groupByColumns(groupByColumns)
    }

    /** @param hiddenColumns A list of columns to hide. */
    public fun hiddenColumns(hiddenColumns: String) {
        cdkBuilder.hiddenColumns(hiddenColumns)
    }

    /** @param ignoreCase Indicates that lower and upper case letters are treated equally. */
    public fun ignoreCase(ignoreCase: String) {
        cdkBuilder.ignoreCase(ignoreCase)
    }

    /** @param includeInSplit Indicates if this column is participating in a split transform. */
    public fun includeInSplit(includeInSplit: String) {
        cdkBuilder.includeInSplit(includeInSplit)
    }

    /**
     * @param input The input location to load the dataset from - Amazon S3 or AWS Glue Data Catalog
     *   .
     */
    public fun input(input: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(input)
        cdkBuilder.input(builder.map)
    }

    /**
     * @param input The input location to load the dataset from - Amazon S3 or AWS Glue Data Catalog
     *   .
     */
    public fun input(input: Any) {
        cdkBuilder.input(input)
    }

    /** @param interval The number of characters to split by. */
    public fun interval(interval: String) {
        cdkBuilder.interval(interval)
    }

    /** @param isText Indicates if the content is text. */
    public fun isText(isText: String) {
        cdkBuilder.isText(isText)
    }

    /** @param joinKeys The keys or columns involved in a join. */
    public fun joinKeys(joinKeys: String) {
        cdkBuilder.joinKeys(joinKeys)
    }

    /**
     * @param joinType The type of join to use, for example, `INNER JOIN` , `OUTER JOIN` , and so
     *   on.
     */
    public fun joinType(joinType: String) {
        cdkBuilder.joinType(joinType)
    }

    /** @param leftColumns The columns on the left side of the join. */
    public fun leftColumns(leftColumns: String) {
        cdkBuilder.leftColumns(leftColumns)
    }

    /** @param limit The number of times to perform `split` or `replaceBy` in a string. */
    public fun limit(limit: String) {
        cdkBuilder.limit(limit)
    }

    /** @param lowerBound The lower boundary for a value. */
    public fun lowerBound(lowerBound: String) {
        cdkBuilder.lowerBound(lowerBound)
    }

    /** @param mapType The type of mappings to apply to construct a new dynamic frame. */
    public fun mapType(mapType: String) {
        cdkBuilder.mapType(mapType)
    }

    /**
     * @param modeType Determines the manner in which mode value is calculated, in case there is
     *   more than one mode value. Valid values: `NONE` | `AVERAGE` | `MINIMUM` | `MAXIMUM`
     */
    public fun modeType(modeType: String) {
        cdkBuilder.modeType(modeType)
    }

    /** @param multiLine Specifies whether JSON input contains embedded new line characters. */
    public fun multiLine(multiLine: Boolean) {
        cdkBuilder.multiLine(multiLine)
    }

    /** @param multiLine Specifies whether JSON input contains embedded new line characters. */
    public fun multiLine(multiLine: IResolvable) {
        cdkBuilder.multiLine(multiLine)
    }

    /** @param numRows The number of rows to consider in a window. */
    public fun numRows(numRows: String) {
        cdkBuilder.numRows(numRows)
    }

    /** @param numRowsAfter The number of rows to consider after the current row in a window. */
    public fun numRowsAfter(numRowsAfter: String) {
        cdkBuilder.numRowsAfter(numRowsAfter)
    }

    /** @param numRowsBefore The number of rows to consider before the current row in a window. */
    public fun numRowsBefore(numRowsBefore: String) {
        cdkBuilder.numRowsBefore(numRowsBefore)
    }

    /** @param orderByColumn A column to sort the results by. */
    public fun orderByColumn(orderByColumn: String) {
        cdkBuilder.orderByColumn(orderByColumn)
    }

    /** @param orderByColumns The columns to sort the results by. */
    public fun orderByColumns(orderByColumns: String) {
        cdkBuilder.orderByColumns(orderByColumns)
    }

    /** @param other The value to assign to unmapped cells, in categorical mapping. */
    public fun other(other: String) {
        cdkBuilder.other(other)
    }

    /** @param pattern The pattern to locate. */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    /** @param patternOption1 The starting pattern to split between. */
    public fun patternOption1(patternOption1: String) {
        cdkBuilder.patternOption1(patternOption1)
    }

    /** @param patternOption2 The ending pattern to split between. */
    public fun patternOption2(patternOption2: String) {
        cdkBuilder.patternOption2(patternOption2)
    }

    /**
     * @param patternOptions For splitting by multiple delimiters: A JSON-encoded string that lists
     *   the patterns in the format. For example: `[{\"pattern\":\"1\",\"includeInSplit\":true}]`
     */
    public fun patternOptions(patternOptions: String) {
        cdkBuilder.patternOptions(patternOptions)
    }

    /** @param period The size of the rolling window. */
    public fun period(period: String) {
        cdkBuilder.period(period)
    }

    /** @param position The character index within a string. */
    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    /**
     * @param removeAllPunctuation If `true` , removes all of the following characters: `.` `.!`
     *   `.,` `.?`.
     */
    public fun removeAllPunctuation(removeAllPunctuation: String) {
        cdkBuilder.removeAllPunctuation(removeAllPunctuation)
    }

    /** @param removeAllQuotes If `true` , removes all single quotes and double quotes. */
    public fun removeAllQuotes(removeAllQuotes: String) {
        cdkBuilder.removeAllQuotes(removeAllQuotes)
    }

    /** @param removeAllWhitespace If `true` , removes all whitespaces from the value. */
    public fun removeAllWhitespace(removeAllWhitespace: String) {
        cdkBuilder.removeAllWhitespace(removeAllWhitespace)
    }

    /**
     * @param removeCustomCharacters If `true` , removes all chraracters specified by
     *   `CustomCharacters` .
     */
    public fun removeCustomCharacters(removeCustomCharacters: String) {
        cdkBuilder.removeCustomCharacters(removeCustomCharacters)
    }

    /** @param removeCustomValue If `true` , removes all chraracters specified by `CustomValue` . */
    public fun removeCustomValue(removeCustomValue: String) {
        cdkBuilder.removeCustomValue(removeCustomValue)
    }

    /**
     * @param removeLeadingAndTrailingPunctuation If `true` , removes the following characters if
     *   they occur at the start or end of the value: `.` `!` `,` `?`.
     */
    public fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String) {
        cdkBuilder.removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation)
    }

    /**
     * @param removeLeadingAndTrailingQuotes If `true` , removes single quotes and double quotes
     *   from the beginning and end of the value.
     */
    public fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String) {
        cdkBuilder.removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes)
    }

    /**
     * @param removeLeadingAndTrailingWhitespace If `true` , removes all whitespaces from the
     *   beginning and end of the value.
     */
    public fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String) {
        cdkBuilder.removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace)
    }

    /**
     * @param removeLetters If `true` , removes all uppercase and lowercase alphabetic characters (A
     *   through Z;. a through z).
     */
    public fun removeLetters(removeLetters: String) {
        cdkBuilder.removeLetters(removeLetters)
    }

    /** @param removeNumbers If `true` , removes all numeric characters (0 through 9). */
    public fun removeNumbers(removeNumbers: String) {
        cdkBuilder.removeNumbers(removeNumbers)
    }

    /**
     * @param removeSourceColumn If `true` , the source column will be removed after un-nesting that
     *   column. (Used with nested column types, such as Map, Struct, or Array.)
     */
    public fun removeSourceColumn(removeSourceColumn: String) {
        cdkBuilder.removeSourceColumn(removeSourceColumn)
    }

    /**
     * @param removeSpecialCharacters If `true` , removes all of the following characters: `!. " # $
     *   % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~`
     */
    public fun removeSpecialCharacters(removeSpecialCharacters: String) {
        cdkBuilder.removeSpecialCharacters(removeSpecialCharacters)
    }

    /** @param rightColumns The columns on the right side of a join. */
    public fun rightColumns(rightColumns: String) {
        cdkBuilder.rightColumns(rightColumns)
    }

    /** @param sampleSize The number of rows in the sample. */
    public fun sampleSize(sampleSize: String) {
        cdkBuilder.sampleSize(sampleSize)
    }

    /**
     * @param sampleType The sampling type to apply to the dataset. Valid values: `FIRST_N` |
     *   `LAST_N` | `RANDOM`
     */
    public fun sampleType(sampleType: String) {
        cdkBuilder.sampleType(sampleType)
    }

    /** @param secondInput A object value to indicate the second dataset used in a join. */
    public fun secondInput(secondInput: String) {
        cdkBuilder.secondInput(secondInput)
    }

    /** @param secondaryInputs A list of secondary inputs in a UNION transform. */
    public fun secondaryInputs(vararg secondaryInputs: Any) {
        _secondaryInputs.addAll(listOf(*secondaryInputs))
    }

    /** @param secondaryInputs A list of secondary inputs in a UNION transform. */
    public fun secondaryInputs(secondaryInputs: Collection<Any>) {
        _secondaryInputs.addAll(secondaryInputs)
    }

    /** @param secondaryInputs A list of secondary inputs in a UNION transform. */
    public fun secondaryInputs(secondaryInputs: IResolvable) {
        cdkBuilder.secondaryInputs(secondaryInputs)
    }

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in a
     *   dataset.
     */
    public fun sheetIndexes(vararg sheetIndexes: Number) {
        _sheetIndexes.addAll(listOf(*sheetIndexes))
    }

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in a
     *   dataset.
     */
    public fun sheetIndexes(sheetIndexes: Collection<Number>) {
        _sheetIndexes.addAll(sheetIndexes)
    }

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in a
     *   dataset.
     */
    public fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes)
    }

    /**
     * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
     *   dataset.
     */
    public fun sheetNames(vararg sheetNames: String) {
        _sheetNames.addAll(listOf(*sheetNames))
    }

    /**
     * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
     *   dataset.
     */
    public fun sheetNames(sheetNames: Collection<String>) {
        _sheetNames.addAll(sheetNames)
    }

    /** @param sourceColumn A source column needed for an operation, step, or transform. */
    public fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    /** @param sourceColumn1 A source column needed for an operation, step, or transform. */
    public fun sourceColumn1(sourceColumn1: String) {
        cdkBuilder.sourceColumn1(sourceColumn1)
    }

    /** @param sourceColumn2 A source column needed for an operation, step, or transform. */
    public fun sourceColumn2(sourceColumn2: String) {
        cdkBuilder.sourceColumn2(sourceColumn2)
    }

    /**
     * @param sourceColumns A list of source columns needed for an operation, step, or transform.
     */
    public fun sourceColumns(sourceColumns: String) {
        cdkBuilder.sourceColumns(sourceColumns)
    }

    /**
     * @param startColumnIndex The index number of the first column used by an operation, step, or
     *   transform.
     */
    public fun startColumnIndex(startColumnIndex: String) {
        cdkBuilder.startColumnIndex(startColumnIndex)
    }

    /** @param startPattern The starting pattern to locate. */
    public fun startPattern(startPattern: String) {
        cdkBuilder.startPattern(startPattern)
    }

    /** @param startPosition The starting position to locate. */
    public fun startPosition(startPosition: String) {
        cdkBuilder.startPosition(startPosition)
    }

    /** @param startValue The starting value to locate. */
    public fun startValue(startValue: String) {
        cdkBuilder.startValue(startValue)
    }

    /**
     * @param stemmingMode Indicates this operation uses stems and lemmas (base words) for word
     *   tokenization.
     */
    public fun stemmingMode(stemmingMode: String) {
        cdkBuilder.stemmingMode(stemmingMode)
    }

    /** @param stepCount The total number of transforms in this recipe. */
    public fun stepCount(stepCount: String) {
        cdkBuilder.stepCount(stepCount)
    }

    /** @param stepIndex The index ID of a step. */
    public fun stepIndex(stepIndex: String) {
        cdkBuilder.stepIndex(stepIndex)
    }

    /**
     * @param stopWordsMode Indicates this operation uses stop words as part of word tokenization.
     */
    public fun stopWordsMode(stopWordsMode: String) {
        cdkBuilder.stopWordsMode(stopWordsMode)
    }

    /** @param strategy The resolution strategy to apply in resolving ambiguities. */
    public fun strategy(strategy: String) {
        cdkBuilder.strategy(strategy)
    }

    /** @param targetColumn The column targeted by this operation. */
    public fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
    }

    /** @param targetColumnNames The names to give columns altered by this operation. */
    public fun targetColumnNames(targetColumnNames: String) {
        cdkBuilder.targetColumnNames(targetColumnNames)
    }

    /** @param targetDateFormat The date format to convert to. */
    public fun targetDateFormat(targetDateFormat: String) {
        cdkBuilder.targetDateFormat(targetDateFormat)
    }

    /** @param targetIndex The index number of an object that is targeted by this operation. */
    public fun targetIndex(targetIndex: String) {
        cdkBuilder.targetIndex(targetIndex)
    }

    /** @param timeZone The current timezone that you want to use for dates. */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    /**
     * @param tokenizerPattern A regex expression to use when splitting text into terms, also called
     *   words or tokens.
     */
    public fun tokenizerPattern(tokenizerPattern: String) {
        cdkBuilder.tokenizerPattern(tokenizerPattern)
    }

    /** @param trueString A value to use to represent `TRUE` . */
    public fun trueString(trueString: String) {
        cdkBuilder.trueString(trueString)
    }

    /** @param udfLang The language that's used in the user-defined function. */
    public fun udfLang(udfLang: String) {
        cdkBuilder.udfLang(udfLang)
    }

    /**
     * @param units Specifies a unit of time. For example: `MINUTES` ; `SECONDS` ; `HOURS` ; etc.
     */
    public fun units(units: String) {
        cdkBuilder.units(units)
    }

    /**
     * @param unpivotColumn Cast columns as rows, so that each value is a different row in a single
     *   column.
     */
    public fun unpivotColumn(unpivotColumn: String) {
        cdkBuilder.unpivotColumn(unpivotColumn)
    }

    /** @param upperBound The upper boundary for a value. */
    public fun upperBound(upperBound: String) {
        cdkBuilder.upperBound(upperBound)
    }

    /** @param useNewDataFrame Create a new container to hold a dataset. */
    public fun useNewDataFrame(useNewDataFrame: String) {
        cdkBuilder.useNewDataFrame(useNewDataFrame)
    }

    /**
     * @param value A static value that can be used in a comparison, a substitution, or in another
     *   context-specific way. A `Value` can be a number, string, or other datatype, depending on
     *   the recipe action in which it's used.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value1 A value that's used by this operation. */
    public fun value1(value1: String) {
        cdkBuilder.value1(value1)
    }

    /** @param value2 A value that's used by this operation. */
    public fun value2(value2: String) {
        cdkBuilder.value2(value2)
    }

    /** @param valueColumn The column that is provided as a value that's used by this operation. */
    public fun valueColumn(valueColumn: String) {
        cdkBuilder.valueColumn(valueColumn)
    }

    /** @param viewFrame The subset of rows currently available for viewing. */
    public fun viewFrame(viewFrame: String) {
        cdkBuilder.viewFrame(viewFrame)
    }

    public fun build(): CfnRecipe.RecipeParametersProperty {
        if (_secondaryInputs.isNotEmpty()) cdkBuilder.secondaryInputs(_secondaryInputs)
        if (_sheetIndexes.isNotEmpty()) cdkBuilder.sheetIndexes(_sheetIndexes)
        if (_sheetNames.isNotEmpty()) cdkBuilder.sheetNames(_sheetNames)
        return cdkBuilder.build()
    }
}
