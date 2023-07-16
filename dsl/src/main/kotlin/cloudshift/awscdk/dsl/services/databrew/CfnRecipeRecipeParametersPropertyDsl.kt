@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeRecipeParametersPropertyDsl {
  private val cdkBuilder: CfnRecipe.RecipeParametersProperty.Builder =
      CfnRecipe.RecipeParametersProperty.builder()

  private val _secondaryInputs: MutableList<Any> = mutableListOf()

  private val _sheetIndexes: MutableList<Number> = mutableListOf()

  private val _sheetNames: MutableList<String> = mutableListOf()

  public fun aggregateFunction(aggregateFunction: String) {
    cdkBuilder.aggregateFunction(aggregateFunction)
  }

  public fun base(base: String) {
    cdkBuilder.base(base)
  }

  public fun caseStatement(caseStatement: String) {
    cdkBuilder.caseStatement(caseStatement)
  }

  public fun categoryMap(categoryMap: String) {
    cdkBuilder.categoryMap(categoryMap)
  }

  public fun charsToRemove(charsToRemove: String) {
    cdkBuilder.charsToRemove(charsToRemove)
  }

  public fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String) {
    cdkBuilder.collapseConsecutiveWhitespace(collapseConsecutiveWhitespace)
  }

  public fun columnDataType(columnDataType: String) {
    cdkBuilder.columnDataType(columnDataType)
  }

  public fun columnRange(columnRange: String) {
    cdkBuilder.columnRange(columnRange)
  }

  public fun count(count: String) {
    cdkBuilder.count(count)
  }

  public fun customCharacters(customCharacters: String) {
    cdkBuilder.customCharacters(customCharacters)
  }

  public fun customStopWords(customStopWords: String) {
    cdkBuilder.customStopWords(customStopWords)
  }

  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  public fun datasetsColumns(datasetsColumns: String) {
    cdkBuilder.datasetsColumns(datasetsColumns)
  }

  public fun dateAddValue(dateAddValue: String) {
    cdkBuilder.dateAddValue(dateAddValue)
  }

  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
  }

  public fun dateTimeParameters(dateTimeParameters: String) {
    cdkBuilder.dateTimeParameters(dateTimeParameters)
  }

  public fun deleteOtherRows(deleteOtherRows: String) {
    cdkBuilder.deleteOtherRows(deleteOtherRows)
  }

  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  public fun endPattern(endPattern: String) {
    cdkBuilder.endPattern(endPattern)
  }

  public fun endPosition(endPosition: String) {
    cdkBuilder.endPosition(endPosition)
  }

  public fun endValue(endValue: String) {
    cdkBuilder.endValue(endValue)
  }

  public fun expandContractions(expandContractions: String) {
    cdkBuilder.expandContractions(expandContractions)
  }

  public fun exponent(exponent: String) {
    cdkBuilder.exponent(exponent)
  }

  public fun falseString(falseString: String) {
    cdkBuilder.falseString(falseString)
  }

  public fun groupByAggFunctionOptions(groupByAggFunctionOptions: String) {
    cdkBuilder.groupByAggFunctionOptions(groupByAggFunctionOptions)
  }

  public fun groupByColumns(groupByColumns: String) {
    cdkBuilder.groupByColumns(groupByColumns)
  }

  public fun hiddenColumns(hiddenColumns: String) {
    cdkBuilder.hiddenColumns(hiddenColumns)
  }

  public fun ignoreCase(ignoreCase: String) {
    cdkBuilder.ignoreCase(ignoreCase)
  }

  public fun includeInSplit(includeInSplit: String) {
    cdkBuilder.includeInSplit(includeInSplit)
  }

  public fun input(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.input(builder.map)
  }

  public fun input(input: Any) {
    cdkBuilder.input(input)
  }

  public fun interval(interval: String) {
    cdkBuilder.interval(interval)
  }

  public fun isText(isText: String) {
    cdkBuilder.isText(isText)
  }

  public fun joinKeys(joinKeys: String) {
    cdkBuilder.joinKeys(joinKeys)
  }

  public fun joinType(joinType: String) {
    cdkBuilder.joinType(joinType)
  }

  public fun leftColumns(leftColumns: String) {
    cdkBuilder.leftColumns(leftColumns)
  }

  public fun limit(limit: String) {
    cdkBuilder.limit(limit)
  }

  public fun lowerBound(lowerBound: String) {
    cdkBuilder.lowerBound(lowerBound)
  }

  public fun mapType(mapType: String) {
    cdkBuilder.mapType(mapType)
  }

  public fun modeType(modeType: String) {
    cdkBuilder.modeType(modeType)
  }

  public fun multiLine(multiLine: Boolean) {
    cdkBuilder.multiLine(multiLine)
  }

  public fun multiLine(multiLine: IResolvable) {
    cdkBuilder.multiLine(multiLine)
  }

  public fun numRows(numRows: String) {
    cdkBuilder.numRows(numRows)
  }

  public fun numRowsAfter(numRowsAfter: String) {
    cdkBuilder.numRowsAfter(numRowsAfter)
  }

  public fun numRowsBefore(numRowsBefore: String) {
    cdkBuilder.numRowsBefore(numRowsBefore)
  }

  public fun orderByColumn(orderByColumn: String) {
    cdkBuilder.orderByColumn(orderByColumn)
  }

  public fun orderByColumns(orderByColumns: String) {
    cdkBuilder.orderByColumns(orderByColumns)
  }

  public fun other(other: String) {
    cdkBuilder.other(other)
  }

  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun patternOption1(patternOption1: String) {
    cdkBuilder.patternOption1(patternOption1)
  }

  public fun patternOption2(patternOption2: String) {
    cdkBuilder.patternOption2(patternOption2)
  }

  public fun patternOptions(patternOptions: String) {
    cdkBuilder.patternOptions(patternOptions)
  }

  public fun period(period: String) {
    cdkBuilder.period(period)
  }

  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun removeAllPunctuation(removeAllPunctuation: String) {
    cdkBuilder.removeAllPunctuation(removeAllPunctuation)
  }

  public fun removeAllQuotes(removeAllQuotes: String) {
    cdkBuilder.removeAllQuotes(removeAllQuotes)
  }

  public fun removeAllWhitespace(removeAllWhitespace: String) {
    cdkBuilder.removeAllWhitespace(removeAllWhitespace)
  }

  public fun removeCustomCharacters(removeCustomCharacters: String) {
    cdkBuilder.removeCustomCharacters(removeCustomCharacters)
  }

  public fun removeCustomValue(removeCustomValue: String) {
    cdkBuilder.removeCustomValue(removeCustomValue)
  }

  public fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String) {
    cdkBuilder.removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation)
  }

  public fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String) {
    cdkBuilder.removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes)
  }

  public fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String) {
    cdkBuilder.removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace)
  }

  public fun removeLetters(removeLetters: String) {
    cdkBuilder.removeLetters(removeLetters)
  }

  public fun removeNumbers(removeNumbers: String) {
    cdkBuilder.removeNumbers(removeNumbers)
  }

  public fun removeSourceColumn(removeSourceColumn: String) {
    cdkBuilder.removeSourceColumn(removeSourceColumn)
  }

  public fun removeSpecialCharacters(removeSpecialCharacters: String) {
    cdkBuilder.removeSpecialCharacters(removeSpecialCharacters)
  }

  public fun rightColumns(rightColumns: String) {
    cdkBuilder.rightColumns(rightColumns)
  }

  public fun sampleSize(sampleSize: String) {
    cdkBuilder.sampleSize(sampleSize)
  }

  public fun sampleType(sampleType: String) {
    cdkBuilder.sampleType(sampleType)
  }

  public fun secondInput(secondInput: String) {
    cdkBuilder.secondInput(secondInput)
  }

  public fun secondaryInputs(vararg secondaryInputs: Any) {
    _secondaryInputs.addAll(listOf(*secondaryInputs))
  }

  public fun secondaryInputs(secondaryInputs: Collection<Any>) {
    _secondaryInputs.addAll(secondaryInputs)
  }

  public fun secondaryInputs(secondaryInputs: IResolvable) {
    cdkBuilder.secondaryInputs(secondaryInputs)
  }

  public fun sheetIndexes(vararg sheetIndexes: Number) {
    _sheetIndexes.addAll(listOf(*sheetIndexes))
  }

  public fun sheetIndexes(sheetIndexes: Collection<Number>) {
    _sheetIndexes.addAll(sheetIndexes)
  }

  public fun sheetIndexes(sheetIndexes: IResolvable) {
    cdkBuilder.sheetIndexes(sheetIndexes)
  }

  public fun sheetNames(vararg sheetNames: String) {
    _sheetNames.addAll(listOf(*sheetNames))
  }

  public fun sheetNames(sheetNames: Collection<String>) {
    _sheetNames.addAll(sheetNames)
  }

  public fun sourceColumn(sourceColumn: String) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  public fun sourceColumn1(sourceColumn1: String) {
    cdkBuilder.sourceColumn1(sourceColumn1)
  }

  public fun sourceColumn2(sourceColumn2: String) {
    cdkBuilder.sourceColumn2(sourceColumn2)
  }

  public fun sourceColumns(sourceColumns: String) {
    cdkBuilder.sourceColumns(sourceColumns)
  }

  public fun startColumnIndex(startColumnIndex: String) {
    cdkBuilder.startColumnIndex(startColumnIndex)
  }

  public fun startPattern(startPattern: String) {
    cdkBuilder.startPattern(startPattern)
  }

  public fun startPosition(startPosition: String) {
    cdkBuilder.startPosition(startPosition)
  }

  public fun startValue(startValue: String) {
    cdkBuilder.startValue(startValue)
  }

  public fun stemmingMode(stemmingMode: String) {
    cdkBuilder.stemmingMode(stemmingMode)
  }

  public fun stepCount(stepCount: String) {
    cdkBuilder.stepCount(stepCount)
  }

  public fun stepIndex(stepIndex: String) {
    cdkBuilder.stepIndex(stepIndex)
  }

  public fun stopWordsMode(stopWordsMode: String) {
    cdkBuilder.stopWordsMode(stopWordsMode)
  }

  public fun strategy(strategy: String) {
    cdkBuilder.strategy(strategy)
  }

  public fun targetColumn(targetColumn: String) {
    cdkBuilder.targetColumn(targetColumn)
  }

  public fun targetColumnNames(targetColumnNames: String) {
    cdkBuilder.targetColumnNames(targetColumnNames)
  }

  public fun targetDateFormat(targetDateFormat: String) {
    cdkBuilder.targetDateFormat(targetDateFormat)
  }

  public fun targetIndex(targetIndex: String) {
    cdkBuilder.targetIndex(targetIndex)
  }

  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun tokenizerPattern(tokenizerPattern: String) {
    cdkBuilder.tokenizerPattern(tokenizerPattern)
  }

  public fun trueString(trueString: String) {
    cdkBuilder.trueString(trueString)
  }

  public fun udfLang(udfLang: String) {
    cdkBuilder.udfLang(udfLang)
  }

  public fun units(units: String) {
    cdkBuilder.units(units)
  }

  public fun unpivotColumn(unpivotColumn: String) {
    cdkBuilder.unpivotColumn(unpivotColumn)
  }

  public fun upperBound(upperBound: String) {
    cdkBuilder.upperBound(upperBound)
  }

  public fun useNewDataFrame(useNewDataFrame: String) {
    cdkBuilder.useNewDataFrame(useNewDataFrame)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun value1(value1: String) {
    cdkBuilder.value1(value1)
  }

  public fun value2(value2: String) {
    cdkBuilder.value2(value2)
  }

  public fun valueColumn(valueColumn: String) {
    cdkBuilder.valueColumn(valueColumn)
  }

  public fun viewFrame(viewFrame: String) {
    cdkBuilder.viewFrame(viewFrame)
  }

  public fun build(): CfnRecipe.RecipeParametersProperty {
    if(_secondaryInputs.isNotEmpty()) cdkBuilder.secondaryInputs(_secondaryInputs)
    if(_sheetIndexes.isNotEmpty()) cdkBuilder.sheetIndexes(_sheetIndexes)
    if(_sheetNames.isNotEmpty()) cdkBuilder.sheetNames(_sheetNames)
    return cdkBuilder.build()
  }
}
